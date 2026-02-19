# DevTalles — Java avanzado: reactividad, concurrencia y patrones

<div align="center">

Course-following folder for **"Java avanzado: reactividad, concurrencia y patrones"** (DevTalles).  
Part of the **Java Core Learning** monorepo.

[Course](https://cursos.devtalles.com/courses/java-avanzado?coupon=learn-01) ·
[Labs (practice)](https://github.com/v0idbuff3r/java-core-lab) ·
[Progress](#progress) ·
[Structure](#folder-structure) ·
[Workflow](#workflow)

<img alt="Java" src="https://img.shields.io/badge/Java-Advanced-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/folder-course--following-2ea44f" />
<img alt="Last commit (path)" src="https://img.shields.io/github/last-commit/v0idbuff3r/javacore-learning-journey?path=10-courses/com.devtalles.javaadvanced" />
<img alt="Repo" src="https://img.shields.io/badge/repo-javacore--learning--journey-lightgrey" />

</div>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&center=true&vCenter=true&width=900&lines=DevTalles+Java+Avanzado;Course-following+folder;Practice+goes+to+java-core-lab;Java+avanzado:+reactividad,+concurrencia+y+patrones;DevTalles+Gabriel+Chaldu;main+protected+%7C+PR-only+%7C+squash+merge" />
</p>

---

## Overview
This folder contains **only** the code and minimal artifacts produced while following the course.

Extra practice (katas/mini-projects/spikes) goes to:
- Labs: https://github.com/v0idbuff3r/java-core-lab

---

## What this folder is (and is not)

### Includes
- lesson-following code (runnable examples)
- section-level implementations derived from the course
- small local artifacts near the code (optional)

### Excludes
- large independent exercise collections
- katas/challenges libraries
- integrator/global projects not tied to the course flow

Rule of thumb:
- **Course folder** = follow course + keep evidence
- **Labs repo** = repetition + variations + deeper practice

---

## Course info
- Platform: DevTalles
- Link: https://cursos.devtalles.com/courses/java-avanzado?coupon=learn-01
- Folder path: `10-courses/com.devtalles.javaadvanced/`

---

## Folder structure

```text
.
├── README.md
└── src/
    ├── s02_generics/
    ├── s03_mvc_lombok_review/
    ├── s04_functional_programming/
    ├── s05_java_optional/
    ├── s06_threads_concurrency/
    ├── s07_reactive_programming/
    ├── s08_sql_introduction/
    ├── s09_database_persistence_jdbc/
    ├── s10_integration_jdbc_dao_transactions/
    ├── s11_design_patterns_uml/
    ├── s12_java_time_api/
    └── s13_spring_boot_introduction/
````

> Note: Course sections with **no code** are intentionally **not represented as folders**:
>
> * S01 Introduction (no-code)
> * S14 Course wrap-up / farewell (no-code)

---

## Quick start

### Option A: IDE (recommended)

Open the monorepo in your IDE and run the desired `main()` class inside this folder.

### Option B: CLI (single file)

If the class has **no package**, you can compile/run directly:

```bash
# from repo root (example; adjust file path)
mkdir -p out
javac -d out 10-courses/com.devtalles.javaadvanced/src/s02_generics/Main.java
java -cp out Main
```

If the file declares a `package`, run using its fully-qualified name (FQN).

---

## Progress

> **Note:** S01 and S14 are **no-code**, so they are tracked here but don’t exist under `src/`.

<!--
TOTAL lessons (.mp4) counted from your local course dump = 183

Manual percent formula (for geps.dev):
PERCENT = round(DONE * 100 / TOTAL)

Example:
DONE=6, TOTAL=16
PERCENT = round(6*100/TOTAL) = round(37.5) = 38

When DONE == TOTAL:
PERCENT = 100 (bar turns green)

Tip (optional):
- switch "DONE/TOTAL" to "✅ TOTAL/TOTAL" to visually mark completion
- and/or rename the row label to include ✅
-->

| Section | Done | Progress |
|---|---:|---|
| **TOTAL (Course)** | `0/183` | <img alt="TOTAL progress" src="https://geps.dev/progress/0" /> |
| S01 - Introduction (no-code) | `0/3` | <img alt="S01 progress" src="https://geps.dev/progress/0" /> |
| [S02 - Generics](./src/s02_generics/) | `0/11` | <img alt="S02 progress" src="https://geps.dev/progress/0" /> |
| [S03 - MVC + Lombok (review)](./src/s03_mvc_lombok_review/) | `0/14` | <img alt="S03 progress" src="https://geps.dev/progress/0" /> |
| [S04 - Functional programming](./src/s04_functional_programming/) | `0/16` | <img alt="S04 progress" src="https://geps.dev/progress/0" /> |
| [S05 - Optional](./src/s05_java_optional/) | `0/18` | <img alt="S05 progress" src="https://geps.dev/progress/0" /> |
| [S06 - Threads & concurrency](./src/s06_threads_concurrency/) | `0/17` | <img alt="S06 progress" src="https://geps.dev/progress/0" /> |
| [S07 - Reactive programming](./src/s07_reactive_programming/) | `0/19` | <img alt="S07 progress" src="https://geps.dev/progress/0" /> |
| [S08 - SQL introduction](./src/s08_sql_introduction/) | `0/10` | <img alt="S08 progress" src="https://geps.dev/progress/0" /> |
| [S09 - Database persistence (JDBC)](./src/s09_database_persistence_jdbc/) | `0/15` | <img alt="S09 progress" src="https://geps.dev/progress/0" /> |
| [S10 - Integration project (JDBC/DAO/transactions)](./src/s10_integration_jdbc_dao_transactions/) | `0/14` | <img alt="S10 progress" src="https://geps.dev/progress/0" /> |
| [S11 - Design patterns + UML](./src/s11_design_patterns_uml/) | `0/16` | <img alt="S11 progress" src="https://geps.dev/progress/0" /> |
| [S12 - Date handling (java.time API)](./src/s12_java_time_api/) | `0/13` | <img alt="S12 progress" src="https://geps.dev/progress/0" /> |
| [S13 - Spring Boot introduction](./src/s13_spring_boot_introduction/) | `0/16` | <img alt="S13 progress" src="https://geps.dev/progress/0" /> |
| S14 - Farewell (no-code) | `0/1` | <img alt="S14 progress" src="https://geps.dev/progress/0" /> |

---

## Learning evidence workflow (Git/GitHub)

**Even if studying solo, work like a team:**
- branch per ticket/topic (internal id)
- PR required as a checkpoint
- quick self-review before merge
- squash merge only on `main`

**Branch examples:**
- `course/devtalles-javaadvanced/s02-feat/generics-wildcards`
- `course/devtalles-javaadvanced/s06-feat/executorservice-basics`
- `course/devtalles-javaadvanced/s11-feat/strategy-pattern`

---

## Links

* Hub: `../../README.md`
* Labs (practice): [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)

