
# Conventions (Java Core Learning)

## Philosophy
- Course hub = follow course + keep evidence organized
- Labs repo = repetition + variations + deeper practice
- main is stable; PRs are checkpoints; squash keeps history readable

## Git/GitHub rules
- Never merge to `main` locally
- Always: branch → push → PR → squash merge on GitHub
- Keep PR scope small: **one course folder OR one transversal folder**

## Naming: course aliases
Use readable aliases in branches/PRs (not folder names with dots):

- `devtalles-javabasics` → `10-courses/com.devtalles.javabasics/`
- `devtalles-javaadvanced` → `10-courses/com.devtalles.javaadvanced/`
- `udemy-masterjava` → `10-courses/com.udemy.mastercompletejava/`
- `atl-javaprofessional` → `10-courses/atl.academy.javaprofessional/`

## Branch naming
Format:

```text
course/<course-alias>/sXX-<kind>/<topic-slug>
````

Kinds:

* `feat | fix | docs | refactor | chore | spike`

Examples:

* `course/devtalles-javabasics/s03-feat/loops-basics`
* `course/devtalles-javabasics/s04-refactor/rename-classes`
* `course/udemy-masterjava/s02-feat/control-flow`
* `course/atl-javaprofessional/s01-feat/variables`
* `exercises/kata-arrays`
* `sandbox/spike-enums`

## PR title

```text
<course-alias> sXX: <short intent>
```

## Commit style

* `feat: ...`
* `fix: ...`
* `docs: ...`
* `refactor: ...`
  Optional prefix:
* `s03 feat: ...`

## Definition of Done (DoD) — PR checkpoint
**Before merging:**
* code compiles / runs (as applicable)
* names are minimally clear
* PR description explains what/why
* scope is controlled (no unrelated files)
* squash merge

## Repository hygiene
**Do not commit:**
* course videos / PDFs / exported HTML

Recommended `.gitignore`:

```gitignore
out/
**/*.class
resources/
**/*.mp4
**/*.pdf
**/*.html
```
