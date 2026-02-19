# BankAccount CLI — Refactor Plan: extraer `BankApp` (Layering + Domain Purity)

**Alias:** `bankaccount-refactor-bankapp` · `cli-layering-refactor-plan`  
**Contexto:** El proyecto BankAccount CLI ya funciona y el dominio está relativamente “puro”.  
**Objetivo del refactor (futuro, tras unidad OOP):** lograr *layering* tipo “empresa” (Main mínimo + App layer) **sin** romper **Domain Purity**.

---

## ✅ Objetivo final (target architecture)

### Capas
1) **Domain (puro):** `BankAccount`
    - Estado: `balance` (y futuros campos: owner, accountNumber, etc.)
    - Operaciones: `deposit(amount)`, `withdraw(amount)`, `getBalance()`
    - **Regla:** NO `Scanner`, NO `System.out`, NO `ConsoleStyle`
    - **Comunicación UI:** devolver `boolean` o resultado (más adelante `Result`/`enum`/exceptions).

2) **App / Controller (CLI flow):** `BankApp`
    - Loop principal (`start()`)
    - Mostrar menú
    - Leer input (`Scanner`)
    - Router (`switch`)
    - Mensajes UI (`ConsoleStyle`)
    - Coordina llamadas al dominio

3) **Bootstrap:** `Main`
    - Construye objetos y arranca la app
    - Debe ser “corto y obvio”

---

## 🎯 Definition of Done del refactor

- `Main` solo crea `BankAccount`, crea `BankApp` y llama `start()`.
- `BankApp` contiene TODO el flujo CLI (loop + menu + input + switch).
- `BankAccount` se mantiene **puro**: sin prints, sin scanner, sin estilos.
- La funcionalidad actual se conserva (regresión cero).

---

## 🧭 Plan de refactor (paso a paso)

### Paso 0 — Preparación (antes de mover nada)
- [ ] Ejecutar el programa y anotar un “happy path” de prueba manual:
    - crear cuenta → depositar → consultar saldo → retirar → consultar saldo → salir
- [ ] (Opcional) Guardar una versión “tag”/commit: `before-bankapp-refactor`.

---

### Paso 1 — Crear clase `BankApp`
**Crear archivo:** `BankApp.java`

**Estado mínimo a mover:**
- [ ] `private BankAccount bankAccount;`
- [ ] `private final Scanner sc;` (o inyectado desde Main)

**API pública:**
- [ ] `public void start()` (contendrá el loop principal)

---

### Paso 2 — Mover loop principal desde `Main` a `BankApp.start()`
Mover desde `Main`:
- [ ] `while(true)` / `do-while`
- [ ] lectura de `menuOption`
- [ ] condición de salida
- [ ] llamada al router

`Main` debe quedar solo como bootstrap.

---

### Paso 3 — Mover UI/routing helpers a `BankApp`
Mover desde `Main` a `BankApp`:
- [ ] `userMenu()` → `displayMenu()`
- [ ] `bankAccountOperations(...)` → `processOption(int option)`
- [ ] `readAmount(...)` → `readAmount(String prompt)`
- [ ] `tryWithdraw(...)` → `handleWithdraw()`
- [ ] `printBalance(...)` → `handleBalance()` o `displayBalance()`

**Regla:** estos métodos pueden usar `ConsoleStyle` y `Scanner` porque son parte de la capa UI/App.

---

### Paso 4 — Dejar `BankAccount` igual de puro
**Mantener en `BankAccount`:**
- [ ] `deposit(double amount)`
- [ ] `boolean withdraw(double amount)`
- [ ] `double getBalance()`

**(Opcional) Ajustes de dominio al volver:**
- [ ] Validar `deposit(amount > 0)`
- [ ] Decidir política: permitir o no sobregiro (balance negativo)

---

### Paso 5 — Ajustar `Main` (bootstrap final)
`Main` debe quedar algo como:

- [ ] crear `BankAccount` inicial
- [ ] crear `BankApp` con esa cuenta
- [ ] `bankApp.start()`

Sin `Scanner`, sin `switch`, sin menú.

---

## 🔍 Checklist de validación (post-refactor)

- [ ] Compila sin warnings nuevos relevantes
- [ ] Flujo CLI funciona igual o mejor
- [ ] `BankAccount` no importa `Scanner`, no usa `System.out`, no usa `ConsoleStyle`
- [ ] El `switch`/router vive en `BankApp`
- [ ] `Main` quedó mínimo (bootstrap)

---

## 🧩 Nota de diseño (futuro)
Cuando el proyecto crezca:
- `BankApp` puede convertirse en `BankAppController` (UI layer),
- y aparecer una capa `Service`/`UseCase` para lógica de aplicación (sin prints),
- y el dominio se mantiene puro.

---

## 🗓 Cuándo hacerlo
**Recomendación:** después de completar la unidad de OOP (para hacerlo con más confianza y sin perder ritmo de estudio).

---
