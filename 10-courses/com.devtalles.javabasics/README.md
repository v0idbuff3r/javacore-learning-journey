# DevTalles — Java: Explora el lenguaje desde cero

<div align="center">

Course-following folder for **"Java: Explora el lenguaje desde cero"** (DevTalles) by **Gabriel Chaldú**.  
Part of the **Java Core Learning** monorepo.

[Course](https://cursos.devtalles.com/courses/Java?coupon=learn-01) ·
[Labs (practice)](https://github.com/v0idbuff3r/java-core-lab) ·
[Progress](#progress) ·
[Structure](#folder-structure) ·
[Workflow](#learning-evidence-workflow-gitgithub)

<img alt="Java" src="https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/folder-course--following-2ea44f" />
<img alt="Last commit (path)" src="https://img.shields.io/github/last-commit/v0idbuff3r/javacore-learning-journey?path=10-courses/com.devtalles.javabasics" />
<img alt="Repo" src="https://img.shields.io/badge/repo-javacore--learning--journey-lightgrey" />

</div>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&center=true&vCenter=true&width=900&lines=DevTalles+Java+Basics;Course-following+folder;Practice+goes+to+java-core-lab;+Java:+Explora+el+lenguaje+desde+cero;DevTalles+Gabriel+Chaldu;main+protected+%7C+PR-only+%7C+squash+merge" />
</p>

---

## Overview

This folder contains:
- course lesson code (instructor-aligned examples when useful)
- my implementation/interpretation of the same concepts
- minimal `.md` artifacts only when they add value

**Extra practice (katas/challenges/mini-projects) lives here:**  
- Labs repo: https://github.com/v0idbuff3r/java-core-lab

---

## What this folder is (and is not)

### Includes
- lesson-following code (runnable examples)
- section projects required by the course
- small local artifacts near the code (optional)

### Excludes
- large independent exercise collections
- katas/challenges libraries
- integrator/global projects

Rule of thumb:
- **Course folder** = follow course + keep evidence
- **Labs repo** = repetition + variations + deeper practice

---

## Course info
- Title: Java: Explora el lenguaje desde cero
- Instructor: Gabriel Chaldú
- Platform: DevTalles
- Folder path: `10-courses/com.devtalles.javabasics/`

---

## Folder structure

<details>
<summary><strong>Tree (high level)</strong></summary>

```text
.
├── README.md
└── src/
    ├── s03_language_fundamentals/
    │   ├── lessons/
    │   └── section_project/
    ├── s04_classes_and_objects/
    │   ├── lessons/
    │   └── sectionproject/
    ├── s05_oop/
    ├── s06_collections/
    ├── s07_exceptions/
    ├── s08_json/
    ├── s09_mvc/
    └── s10_lombok/
````

</details>

### Naming rules (lightweight)

* `sXX_.../` = course sections
* `lessons/` = lesson code examples
* `section_project/` / `sectionproject/` = section project(s)
* `ref.../` (optional) = instructor reference/baseline comparison

---

## Quick start

### Option A: IDE (recommended)

Open the monorepo in your IDE and run the desired `main()` class inside this folder.

### Option B: CLI (single file)

If the class has **no package**, you can compile/run directly:

```bash
# from repo root (example; adjust file path)
mkdir -p out
javac -d out 10-courses/com.devtalles.javabasics/src/s03_language_fundamentals/lessons/PrimitiveVariables.java
java -cp out PrimitiveVariables
```

If the file declares a `package`, run using its fully-qualified name (FQN).

---

## Progress

> **Course syllabus source:** DevTalles course page (public outline).
> Totals below match the outline items (includes quizzes / “Código fuente” when listed).

<!--
Manual percent formula (for geps.dev):
PERCENT = round(DONE * 100 / TOTAL)

Example:
DONE=6, TOTAL=19
PERCENT = round(6*100/19) = round(31.57) = 32

When DONE == TOTAL:
PERCENT = 100 (bar turns green)

Tip (optional completion styling):
- switch DONE/TOTAL to: ✅ TOTAL/TOTAL
- and keep the bar at: https://geps.dev/progress/100
-->

| Section                                                            |      Done | Progress                                                       |
| ------------------------------------------------------------------ | --------: | -------------------------------------------------------------- |
| **TOTAL (Course)** | `69/144` | <img alt="TOTAL progress" src="https://geps.dev/progress/48" /> |
| S01 - Introducción *(no-folder)*                                   |   `✅ 4/4` | <img alt="S01 progress" src="https://geps.dev/progress/100" />   |
| S02 - Primeros pasos en Java *(setup / no-folder)*                 | `✅ 11/11` | <img alt="S02 progress" src="https://geps.dev/progress/100" />   |
| [S03 - Fundamentos del lenguaje](./src/s03_language_fundamentals/) | `✅ 19/19` | <img alt="S03 progress" src="https://geps.dev/progress/100" /> |
| [S04 - Clases y Objetos](./src/s04_classes_and_objects/)           | `✅ 20/20` | <img alt="S04 progress" src="https://geps.dev/progress/100" /> |
| [S05 - Programación Orientada a Objetos (POO)](./src/s05_oop/)     | `✅ 15/15` | <img alt="S05 progress" src="https://geps.dev/progress/100" /> |
| [S06 - Estructuras de Datos y Colecciones](./src/s06_collections/) |    `0/24` | <img alt="S06 progress" src="https://geps.dev/progress/0" />   |
| [S07 - Manejo de Excepciones](./src/s07_exceptions/)               |    `0/17` | <img alt="S07 progress" src="https://geps.dev/progress/0" />   |
| [S08 - Manejo de JSON](./src/s08_json/)                            |    `0/15` | <img alt="S08 progress" src="https://geps.dev/progress/0" />   |
| [S09 - Aplicación práctica con el patrón MVC](./src/s09_mvc/)      |    `0/15` | <img alt="S09 progress" src="https://geps.dev/progress/0" />   |
| [S10 - Bonus: Lombok](./src/s10_lombok/)                           |     `0/2` | <img alt="S10 progress" src="https://geps.dev/progress/0" />   |
| S11 - Fin del curso *(no-folder)*                                  |     `0/2` | <img alt="S11 progress" src="https://geps.dev/progress/0" />   |

---

## Learning evidence workflow (Git/GitHub)

**Even if studying solo, work like a team:**

* branch per ticket/topic (internal id)
* PR required as a checkpoint
* quick self-review before merge

**Suggested internal ids:**

* `s03-lxx` for lessons (e.g., `s03-l05`)
* `s04-lxx` for lessons (e.g., `s04-l02`)
* `s05-mpxx` for mini-projects (e.g., `s05-mp01`)
* `s03-p01` for section projects (e.g., `s03-p01`)

Branch examples (aligned with hub conventions):

* `course/devtalles-javabasics/s03-feat/loops-basics`
* `course/devtalles-javabasics/s04-refactor/rename-classes`
* `course/devtalles-javabasics/s03-feat/grade-calculator`

---

## Links

* Hub: `../../README.md`
* Labs (practice): [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)

