# ATL Academy — Curso de Java Profesional (desde 0)

<div align="center">

Course-following folder for **"Curso de Java Profesional (desde 0)"** (ATL Academy).  
Part of the **Java Core Learning** monorepo.

[Course](https://atl.academy/es) ·
[Labs (practice)](https://github.com/v0idbuff3r/java-core-lab) ·
[Progress](#progress) ·
[Structure](#folder-structure) ·
[Workflow](#learning-evidence-workflow-gitgithub)

<img alt="Java" src="https://img.shields.io/badge/Java-Professional-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/folder-course--following-2ea44f" />
<img alt="Last commit (path)" src="https://img.shields.io/github/last-commit/v0idbuff3r/javacore-learning-journey?path=10-courses/academy.atl.javaprofessional" />
<img alt="Repo" src="https://img.shields.io/badge/repo-javacore--learning--journey-lightgrey" />

</div>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&center=true&vCenter=true&width=900&lines=ATL+Academy+Java+Professional;Course-following+folder;Practice+goes+to+java-core-lab;Curso+de+Java+Profesional+(desde+0);main+protected+%7C+PR-only+%7C+squash+merge" />
</p>

---

## Overview

This folder contains:
- course-following code (runnable examples when useful)
- my implementations of the exercises/projects
- minimal `.md` artifacts only when they add value

**Extra practice (katas/challenges/mini-projects) lives here:**  
- Labs repo: https://github.com/v0idbuff3r/java-core-lab

---

## What this folder is (and is not)

### Includes
- lesson-following code (runnable examples)
- exercises/projects required by the course
- small local artifacts near the code (optional)

### Excludes
- large independent exercise collections
- katas/challenges libraries
- integrator/global projects not required by the course

Rule of thumb:
- **Course folder** = follow course + keep evidence
- **Labs repo** = repetition + variations + deeper practice

---

## Course info
- Title: Curso de Java Profesional (desde 0)
- Platform: ATL Academy
- Link: https://atl.academy/es
- Folder path: `10-courses/academy.atl.javaprofessional/`

---

## Folder structure

<details>
<summary><strong>Tree (high level)</strong></summary>

```text
.
├── README.md
└── src/
    ├── s01_introduction/
    ├── s02_loops/
    ├── s03_arrays_and_lists/
    ├── s04_algorithms_hashmap/
    ├── s05_oop_fundamentals/
    ├── s06_oop_advanced/
    ├── s07_create_desktop_apps/
    ├── s08_essential_advanced_concepts/
    ├── s09_streams/
    ├── s10_solid_principles/
    └── s11_design_patterns/
````

</details>

### Naming rules (lightweight)

* `sXX_.../` = course sections (English, package-safe)
* `lowercase + underscores` only (safe for Java `package` paths if needed later)

---

## Quick start

### Option A: IDE (recommended)

Open the monorepo in your IDE and run the desired `main()` class inside this folder.

### Option B: CLI (single file)

If the class has **no package**, you can compile/run directly:

```bash
# from repo root (example; adjust file path)
mkdir -p out
javac -d out 10-courses/academy.atl.javaprofessional/src/s01_introduction/Main.java
java -cp out Main
```

If the file declares a `package`, run using its fully-qualified name (FQN).

---

## Progress

> **Tracking basis:** counts are taken from your local `.mp4` course archive (lecture/exercise videos per section).  
> Even if this repo is **code-only**, this table tracks **course coverage**; you update `DONE/TOTAL` manually when you finish each video/exercise.

<!--
Manual percent formula (for geps.dev):
PERCENT = round(DONE * 100 / TOTAL)

Example:
DONE=22, TOTAL=78
PERCENT = round(22*100/78) = round(28.205...) = 28

When DONE == TOTAL:
PERCENT = 100 (bar turns green)

Tip (optional completion styling):
- switch DONE/TOTAL to: ✅ TOTAL/TOTAL
- and keep the bar at: https://geps.dev/progress/100
-->

| Section | Done | Progress |
|---|---:|---|
| **TOTAL (Course)** | `0/78` | <img alt="TOTAL progress" src="https://geps.dev/progress/0" /> |
| [S01 - Introduction (Introducción)](./src/s01_introduction/) | `0/11` | <img alt="S01 progress" src="https://geps.dev/progress/0" /> |
| [S02 - Loops (Bucles)](./src/s02_loops/) | `0/15` | <img alt="S02 progress" src="https://geps.dev/progress/0" /> |
| [S03 - Arrays & Lists (Arreglos y prácticas)](./src/s03_arrays_and_lists/) | `0/12` | <img alt="S03 progress" src="https://geps.dev/progress/0" /> |
| [S04 - Algorithms + HashMap (Algoritmos)](./src/s04_algorithms_hashmap/) | `0/4` | <img alt="S04 progress" src="https://geps.dev/progress/0" /> |
| [S05 - OOP Fundamentals (POO fundamentos)](./src/s05_oop_fundamentals/) | `0/9` | <img alt="S05 progress" src="https://geps.dev/progress/0" /> |
| [S06 - OOP Advanced (POO avanzado)](./src/s06_oop_advanced/) | `0/6` | <img alt="S06 progress" src="https://geps.dev/progress/0" /> |
| [S07 - Desktop Apps (Programas de escritorio)](./src/s07_create_desktop_apps/) | `0/2` | <img alt="S07 progress" src="https://geps.dev/progress/0" /> |
| [S08 - Essential Advanced Concepts (Conceptos avanzados)](./src/s08_essential_advanced_concepts/) | `0/7` | <img alt="S08 progress" src="https://geps.dev/progress/0" /> |
| [S09 - Streams](./src/s09_streams/) | `0/5` | <img alt="S09 progress" src="https://geps.dev/progress/0" /> |
| [S10 - SOLID Principles](./src/s10_solid_principles/) | `0/3` | <img alt="S10 progress" src="https://geps.dev/progress/0" /> |
| [S11 - Design Patterns (Patrones de diseño)](./src/s11_design_patterns/) | `0/4` | <img alt="S11 progress" src="https://geps.dev/progress/0" /> |

---

## Learning evidence workflow (Git/GitHub)

**Even if studying solo, work like a team:**

* branch per ticket/topic (internal id)
* PR required as a checkpoint
* quick self-review before merge

**Suggested internal ids:**

* `s02-lxx` for lessons (e.g., `s02-l03`)
* `s03-exx` for exercises (e.g., `s03-e07`)
* `s05-pxx` for OOP projects/exercises (e.g., `s05-p01`)

Branch examples (aligned with hub conventions):

* `course/atl-javaprofessional/s02-feat/while-basics`
* `course/atl-javaprofessional/s03-feat/task-list-exercise`
* `course/atl-javaprofessional/s05-refactor/encapsulation-cleanup`

---

## Links

* Hub: `../../README.md`
* Labs (practice): [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)

---



