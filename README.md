# Java Core Learning

<div align="center">

Monorepo for **Java Core course-following**.  
Code + minimal artifacts. Deliberate practice lives in **java-core-lab**.

[Courses](#courses) ·
[Progress](#progress) ·
[Structure](#repository-structure) ·
[Workflow](#workflow-solo-but-professional) ·
[Conventions](#conventions-quick)

<img alt="Java" src="https://img.shields.io/badge/Java-Core-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/repo-monorepo--course--hub-2ea44f" />
<img alt="Last commit" src="https://img.shields.io/github/last-commit/v0idbuff3r/javacore-learning-journey" />
<img alt="Stars" src="https://img.shields.io/github/stars/v0idbuff3r/javacore-learning-journey?style=flat" />
<img alt="Issues" src="https://img.shields.io/github/issues/v0idbuff3r/javacore-learning-journey?style=flat" />
<img alt="License" src="https://img.shields.io/badge/license-TBD-lightgrey" />

</div>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=24&pause=1000&center=true&vCenter=true&width=900&lines=Java+Core+Learning+Journey;Monorepo+for+course-following;main+protected+%7C+PR-only+%7C+squash+merge" />
</p>

---

## Overview

This repository is a **structured learning workspace** for Java Core.

- **Course hub** = follow courses + keep learning evidence organized
- **Labs repo** = repetition + katas + mini-projects + experiments  
  - Labs: https://github.com/v0idbuff3r/java-core-lab

### What this repo includes
- course lesson code (examples / instructor-aligned when useful)
- section projects required by the course
- minimal `.md` artifacts only if they are instructions for exercises/mini-projects or they directly support the code 

### What this repo excludes
- big independent practice libraries
- integrator/global projects
- full study notes (Obsidian is the source of truth)

---

## Courses

Each course has its own folder and README:

- **DevTalles — Java Basics**  
  `10-courses/com.devtalles.javabasics/`  
  https://cursos.devtalles.com/courses/Java

- **DevTalles — Java Advanced (reactivity, concurrency, patterns)**  
  `10-courses/com.devtalles.javaadvanced/`  
  https://cursos.devtalles.com/courses/java-avanzado

- **Udemy — Máster Completo Java de cero a experto (+163h)**  
  `10-courses/com.udemy.mastercompletejava/`  
  https://www.udemy.com/course/master-completo-java-de-cero-a-experto/

- **ATL Academy — Curso de Java Profesional (desde 0) (15h)**  
  `10-courses/atl.academy.javaprofessional/`  
  https://atl.academy/es

---

## Repository structure

<details>
<summary><strong>Tree (high level)</strong></summary>

```text
.
├── 00-meta/
│   ├── conventions.md
│   ├── resources.md
│   └── roadmap.md
├── 10-courses/
│   ├── atl.academy.javaprofessional/
│   ├── com.devtalles.javaadvanced/
│   ├── com.devtalles.javabasics/
│   ├── com.udemy.mastercompletejava/
│   └── utilities/
├── 20-exercises/
└── 30-sandboxes/
````

</details>

---

## Workflow (solo, but professional)

Even if studying solo, work like a team:

* `main` is always stable
* all changes happen in branches
* **Pull Request (PR) is mandatory**
* **Squash merge only** (clean `main`)
* branches get deleted after merge

### Main branch rules (GitHub settings)

* Require PR before merging
* Require conversation resolution
* Require linear history
* Block force pushes / deletions (recommended)

---

## Conventions (quick)

### Branch naming

Format:

```text
course/<course-alias>/sXX-<kind>/<topic-slug>
```

Examples:

* `course/devtalles-javabasics/s03-feat/java-fundamentals`
* `course/devtalles-javabasics/s04-refactor/rename-classes`
* `course/udemy-masterjava/s02-feat/control-flow`
* `course/atl-javaprofessional/s01-docs/initial-setup`
* `exercises/kata-strings`
* `sandbox/spike-enums`

**Kinds:** `feat | fix | docs | refactor | chore | spike`

### PR title (checkpoint)

```text
<course-alias> sXX: <short intent>
```

### Commits (minimal)

* `feat: ...`
* `fix: ...`
* `docs: ...`
* `refactor: ...`
  Optionally prefix: `s03 feat: ...`

### Definition of Done (DoD) for a checkpoint

A change is “done” when:

* code compiles / runs (as applicable)
* intent is documented (PR description)
* 1+ clear commit
* PR exists and is merged (squash)
* no unrelated files changed

Full details live in: `00-meta/conventions.md`.

---

## Progress

### Overall course status

* [ ] DevTalles — Java Basics (in progress)
* [ ] DevTalles — Java Advanced (planned / in progress)
* [ ] Udemy — Master Complete Java (planned / in progress)
* [ ] ATL — Java Professional (in progress)

Each course has its own detailed checklist inside its folder README.

---

## Notes (Obsidian)

Study notes live outside this repository (Obsidian vault).
This repo keeps **publish-safe** learning evidence (code + minimal artifacts).

---

## License

TBD.

