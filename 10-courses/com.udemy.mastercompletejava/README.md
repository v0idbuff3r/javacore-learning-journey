# Udemy — Máster Completo Java de cero a experto (+163h)

<div align="center">

Course-following folder for **"Máster Completo Java de cero a experto Actualizado (+163hrs)"** (Udemy).  
Part of the **Java Core Learning** monorepo.

[Course](https://www.udemy.com/course/master-completo-java-de-cero-a-experto/) ·
[Labs (practice)](https://github.com/v0idbuff3r/java-core-lab) ·
[Progress](#progress) ·
[Structure](#folder-structure)

<img alt="Java" src="https://img.shields.io/badge/Java-Master-ED8B00?logo=openjdk&logoColor=white" />
<img alt="Type" src="https://img.shields.io/badge/folder-course--following-2ea44f" />
<img alt="Last commit (path)" src="https://img.shields.io/github/last-commit/v0idbuff3r/javacore-learning-journey?path=10-courses/com.udemy.mastercompletejava" />
<img alt="Repo" src="https://img.shields.io/badge/repo-javacore--learning--journey-lightgrey" />

</div>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&center=true&vCenter=true&width=900&lines=Udemy+Java+Complete+Master;Course-following+folder;Practice+goes+to+java-core-lab;Master+Completo+Java+de+cero+a+experto+(163h);Udemy+Andres+Guzman;main+protected+%7C+PR-only+%7C+squash+merge" />
</p>

---

## Overview
This folder contains course-following code and minimal artifacts only.

Practice (katas/mini-projects) goes to:
- Labs: https://github.com/v0idbuff3r/java-core-lab

---

## Naming & IntelliJ/Java rules (this folder)
### Scope
- This folder is **code-only**: Java source + minimal repo artifacts.
- Docs/spec-heavy content lives elsewhere in the monorepo (or in labs if it’s practice).

### Folder naming (because folders become Java packages)

#### Folder IDs
**Modules:** `mNN_<module_slug>` (NN = 2 digits)  
**Sections:** `sNNN_<section_slug>` (NNN = 3 digits)

#### Hard rules (package-safe)
- lowercase only
- only `a-z 0-9 _`
- **no hyphens** (`-`) inside `src/`
- ASCII-only
- `src/` is **Source Root** in IntelliJ (everything else = plain folders)

#### Under `src/`, folder names must be valid Java identifiers
- lowercase
- underscores allowed
- **NO hyphens** (`-` breaks `package`/`import`)

#### Conventions used here
- `m` = **module**
- `s` = **section**
- Templates:
  - `m##_topic_name`
  - `s###_topic_name`

### Source Root rule
- `src/` is the **Source Root**.
- Any Java file inside must have a matching `package ...;` that mirrors the path under `src/`.

Example:
- File: `src/m01_java_core/s002_variables/Hello.java`
- Package: `package m01_java_core.s002_variables;`

### Shared utilities (optional)
To keep imports stable across all sections:
- `src/utilities/ConsoleStyle.java`
- `package utilities;`
- Use: `import utilities.ConsoleStyle;`

---

## Course info
- Platform: Udemy
- Link: https://www.udemy.com/course/master-completo-java-de-cero-a-experto/
- Folder path: `10-courses/com.udemy.mastercompletejava/`

---

## Folder structure

```text
.
├── README.md
└── src/
    ├── m01_java_core/                          # S001–S013: fundamentals (intro → variables/strings/operators → arrays/matrices)
    ├── m02_oop_collections_concurrency_fp/     # S014–S033: OOP + generics + exceptions + collections + concurrency + Java 8 FP + annotations/recursion/patterns/files
    ├── m03_data_access_jdbc/                   # S034–S036: JDBC (databases, connection pool, transactions)
    ├── m04_desktop_ui_swing/                   # S037–S038: Swing desktop GUI (+ JDBC app)
    ├── m05_testing/                            # S039–S040: unit testing (JUnit 5, Mockito)
    ├── m06_jakarta_ee/                         # S041–S080: Jakarta EE 9 (Servlets → JSTL/Bootstrap/Auth/Pool → CDI → JPA/Hibernate → EJB → JSF → WS → JAAS)
    ├── m07_spring_boot_core/                   # S081–S084: Spring Boot core (webapps, REST API, React app, Angular app)
    ├── m08_reactive_microservices_realtime/    # S085–S095: JavaFX + WebSocket chat + Reactor/WebFlux + Spring Cloud microservices (Products/Items/Eureka/Gateway)
    └── m09_spring_boot_advanced/               # S096–S107: Spring Boot advanced (tools/DI/forms/errors/interceptors/JPA CRUD/invoicing/security/i18n/views/JWT/farewell)

````

---

## Progress

### Progress dashboard

<!--
Manual percent formula (for geps.dev):
PERCENT = round(DONE * 100 / TOTAL)

Example:
DONE=6, TOTAL=16
PERCENT = round(6*100/16) = round(37.5) = 38

When DONE == TOTAL:
PERCENT = 100 (bar turns green)

Tips (optional, manual):
- switch `DONE/TOTAL` to `✅ TOTAL/TOTAL` to visually mark completion
- add ✅ to the module name
-->

| Module                                                                                  |    Done | Progress                                                       |
| --------------------------------------------------------------------------------------- | ------: | -------------------------------------------------------------- |
| **TOTAL (Course)**                                                                      | `0/107` | <img alt="TOTAL progress" src="https://geps.dev/progress/0" /> |
| [M01 - Java Core](./src/m01_java_core/)                                                 |  `0/13` | <img alt="M01 progress" src="https://geps.dev/progress/0" />   |
| [M02 - OOP + Collections + Concurrency + FP](./src/m02_oop_collections_concurrency_fp/) |  `0/20` | <img alt="M02 progress" src="https://geps.dev/progress/0" />   |
| [M03 - Data Access (JDBC)](./src/m03_data_access_jdbc/)                                 |   `0/3` | <img alt="M03 progress" src="https://geps.dev/progress/0" />   |
| [M04 - Desktop UI (Swing)](./src/m04_desktop_ui_swing/)                                 |   `0/2` | <img alt="M04 progress" src="https://geps.dev/progress/0" />   |
| [M05 - Testing](./src/m05_testing/)                                                     |   `0/2` | <img alt="M05 progress" src="https://geps.dev/progress/0" />   |
| [M06 - Jakarta EE](./src/m06_jakarta_ee/)                                               |  `0/40` | <img alt="M06 progress" src="https://geps.dev/progress/0" />   |
| [M07 - Spring Boot (Core)](./src/m07_spring_boot_core/)                                 |   `0/4` | <img alt="M07 progress" src="https://geps.dev/progress/0" />   |
| [M08 - Reactive + Microservices + Realtime](./src/m08_reactive_microservices_realtime/) |  `0/11` | <img alt="M08 progress" src="https://geps.dev/progress/0" />   |
| [M09 - Spring Boot (Advanced)](./src/m09_spring_boot_advanced/)                         |  `0/12` | <img alt="M09 progress" src="https://geps.dev/progress/0" />   |

### Modules (checklists)

<details>
  <summary><strong>M01 - Java Core</strong> — <code>0/13</code> — <a href="./src/m01_java_core/">open folder</a></summary>

* [ ] [S001 - Introduction](./src/m01_java_core/s001_introduction/)
* [ ] [S002 - Variables](./src/m01_java_core/s002_variables/)
* [ ] [S003 - Strings](./src/m01_java_core/s003_strings/)
* [ ] [S004 - Operators](./src/m01_java_core/s004_operators/)
* [ ] [S005 - Control Flow](./src/m01_java_core/s005_control_flow/)
* [ ] [S006 - Wrapper Classes](./src/m01_java_core/s006_wrapper_classes/)
* [ ] [S007 - Value vs Reference](./src/m01_java_core/s007_value_vs_reference/)
* [ ] [S008 - Date & Calendar](./src/m01_java_core/s008_date_calendar/)
* [ ] [S009 - System Class](./src/m01_java_core/s009_system/)
* [ ] [S010 - Math Class](./src/m01_java_core/s010_math/)
* [ ] [S011 - Command Line](./src/m01_java_core/s011_command_line/)
* [ ] [S012 - Arrays](./src/m01_java_core/s012_arrays/)
* [ ] [S013 - Matrices (2D Arrays)](./src/m01_java_core/s013_matrices_2d_arrays/)

</details>

<details>
  <summary><strong>M02 - OOP + Collections + Concurrency + FP</strong> — <code>0/20</code> — <a href="./src/m02_oop_collections_concurrency_fp/">open folder</a></summary>

* [ ] [S014 - OOP: Classes and Objects](./src/m02_oop_collections_concurrency_fp/s014_oop_classes_objects/)
* [ ] [S015 - OOP: Packages](./src/m02_oop_collections_concurrency_fp/s015_oop_packages/)
* [ ] [S016 - OOP: Invoicing Example](./src/m02_oop_collections_concurrency_fp/s016_oop_invoicing_example/)
* [ ] [S017 - OOP: Method Overloading](./src/m02_oop_collections_concurrency_fp/s017_oop_method_overloading/)
* [ ] [S018 - OOP: Inheritance](./src/m02_oop_collections_concurrency_fp/s018_oop_inheritance/)
* [ ] [S019 - OOP: Inheritance + Abstract Classes](./src/m02_oop_collections_concurrency_fp/s019_oop_abstract_classes/)
* [ ] [S020 - OOP: Interfaces](./src/m02_oop_collections_concurrency_fp/s020_oop_interfaces/)
* [ ] [S021 - OOP: Repository Interface Example](./src/m02_oop_collections_concurrency_fp/s021_oop_repository_interface_example/)
* [ ] [S022 - Java Generics](./src/m02_oop_collections_concurrency_fp/s022_java_generics/)
* [ ] [S023 - Exception Handling](./src/m02_oop_collections_concurrency_fp/s023_exception_handling/)
* [ ] [S024 - Collections Framework](./src/m02_oop_collections_concurrency_fp/s024_collections_framework/)
* [ ] [S025 - Threads & Concurrency](./src/m02_oop_collections_concurrency_fp/s025_threads_concurrency/)
* [ ] [S026 - Lambdas (Java 8 FP)](./src/m02_oop_collections_concurrency_fp/s026_lambdas/)
* [ ] [S027 - Stream API (Java 8 FP)](./src/m02_oop_collections_concurrency_fp/s027_stream_api/)
* [ ] [S028 - Optional (Java 8 FP)](./src/m02_oop_collections_concurrency_fp/s028_optional/)
* [ ] [S029 - Java 8 Date Time](./src/m02_oop_collections_concurrency_fp/s029_java_time/)
* [ ] [S030 - Annotations](./src/m02_oop_collections_concurrency_fp/s030_annotations/)
* [ ] [S031 - Recursion](./src/m02_oop_collections_concurrency_fp/s031_recursion/)
* [ ] [S032 - Design Patterns](./src/m02_oop_collections_concurrency_fp/s032_design_patterns/)
* [ ] [S033 - File I/O](./src/m02_oop_collections_concurrency_fp/s033_file_io/)

</details>

<details>
  <summary><strong>M03 - Data Access (JDBC)</strong> — <code>0/3</code> — <a href="./src/m03_data_access_jdbc/">open folder</a></summary>

* [ ] [S034 - JDBC Databases](./src/m03_data_access_jdbc/s034_jdbc_databases/)
* [ ] [S035 - JDBC Connection Pool](./src/m03_data_access_jdbc/s035_jdbc_connection_pool/)
* [ ] [S036 - JDBC Transactions](./src/m03_data_access_jdbc/s036_jdbc_transactions/)

</details>

<details>
  <summary><strong>M04 - Desktop UI (Swing)</strong> — <code>0/2</code> — <a href="./src/m04_desktop_ui_swing/">open folder</a></summary>

* [ ] [S037 - Swing GUI Basics](./src/m04_desktop_ui_swing/s037_swing_gui_basics/)
* [ ] [S038 - Swing GUI + JDBC App](./src/m04_desktop_ui_swing/s038_swing_gui_jdbc_app/)

</details>

<details>
  <summary><strong>M05 - Testing</strong> — <code>0/2</code> — <a href="./src/m05_testing/">open folder</a></summary>

* [ ] [S039 - Unit Testing: JUnit 5](./src/m05_testing/s039_testing_junit5/)
* [ ] [S040 - Unit Testing: Mockito](./src/m05_testing/s040_testing_mockito/)

</details>

<details>
  <summary><strong>M06 - Jakarta EE</strong> — <code>0/40</code> — <a href="./src/m06_jakarta_ee/">open folder</a></summary>

> Rule: mark a section done when code is runnable + PR merged (checkpoint).

#### Overview

* [ ] [S041 - Java EE → Jakarta EE](./src/m06_jakarta_ee/s041_jakarta_ee_overview/)

#### Servlet API (HTTP basics)

* [ ] [S042 - Servlet API: Introduction](./src/m06_jakarta_ee/s042_servlet_intro/)
* [ ] [S043 - Servlet API: Form Handling](./src/m06_jakarta_ee/s043_servlet_form_handling/)
* [ ] [S044 - Servlet API: HTTP Headers & Status](./src/m06_jakarta_ee/s044_servlet_headers_status/)
* [ ] [S045 - Servlet API: Cookies](./src/m06_jakarta_ee/s045_servlet_cookies/)
* [ ] [S046 - Servlet API: Sessions (HttpSession)](./src/m06_jakarta_ee/s046_servlet_sessions_httpsession/)
* [ ] [S047 - Servlet API: Shopping Cart (HttpSession)](./src/m06_jakarta_ee/s047_servlet_shopping_cart/)
* [ ] [S048 - Servlet API: Listeners](./src/m06_jakarta_ee/s048_servlet_listeners/)
* [ ] [S049 - Servlet API: HTTP Filters](./src/m06_jakarta_ee/s049_servlet_filters_http/)
* [ ] [S050 - Servlet API: JDBC Integration](./src/m06_jakarta_ee/s050_servlet_jdbc/)
* [ ] [S051 - Servlet API: JDBC CRUD (MySQL)](./src/m06_jakarta_ee/s051_servlet_jdbc_crud_mysql/)
* [ ] [S052 - JSTL (JSP Standard Tag Library)](./src/m06_jakarta_ee/s052_jstl/)
* [ ] [S053 - Layout + CSS Bootstrap](./src/m06_jakarta_ee/s053_layout_css_bootstrap/)
* [ ] [S054 - Auth System (JDBC + MySQL)](./src/m06_jakarta_ee/s054_auth_jdbc_mysql/)
* [ ] [S055 - JDBC Pool (Tomcat Datasource)](./src/m06_jakarta_ee/s055_jdbc_pool_tomcat_datasource/)

#### CDI (Dependency Injection)

* [ ] [S056 - CDI: Dependency Injection & Contexts](./src/m06_jakarta_ee/s056_cdi_di_contexts/)

#### JPA / Hibernate

* [ ] [S057 - JPA + Hibernate: Fundamentals](./src/m06_jakarta_ee/s057_jpa_hibernate_intro/)
* [ ] [S058 - JPA + Hibernate: JPQL Queries](./src/m06_jakarta_ee/s058_jpa_hibernate_jpql/)
* [ ] [S059 - JPA + Hibernate: Criteria API](./src/m06_jakarta_ee/s059_jpa_hibernate_criteria/)
* [ ] [S060 - JPA + Hibernate: Lifecycle Events](./src/m06_jakarta_ee/s060_jpa_hibernate_lifecycle/)
* [ ] [S061 - JPA + Hibernate: Associations](./src/m06_jakarta_ee/s061_jpa_hibernate_associations/)
* [ ] [S062 - JPA + Hibernate: Fetch Type (Lazy/Eager)](./src/m06_jakarta_ee/s062_jpa_hibernate_fetch/)
* [ ] [S063 - JPA + Hibernate: Join Fetch](./src/m06_jakarta_ee/s063_jpa_hibernate_join_fetch/)
* [ ] [S064 - Servlet + JPA + CDI Integration](./src/m06_jakarta_ee/s064_servlet_jpa_cdi_integration/)

#### EJB (Enterprise JavaBeans)

* [ ] [S065 - EJB: Fundamentals](./src/m06_jakarta_ee/s065_ejb_intro/)
* [ ] [S066 - EJB: Remote Communication](./src/m06_jakarta_ee/s066_ejb_remote/)
* [ ] [S067 - EJB: Deployments & EAR Structure](./src/m06_jakarta_ee/s067_ejb_deployments_ear/)
* [ ] [S068 - Migrating WebApp-JPA to EJB](./src/m06_jakarta_ee/s068_migrate_webapp_jpa_to_ejb/)

#### JSF (JavaServer Faces)

* [ ] [S069 - JSF 3: Introduction](./src/m06_jakarta_ee/s069_jsf3_intro/)
* [ ] [S070 - JSF 3: Forms & Validation](./src/m06_jakarta_ee/s070_jsf3_forms_validation/)
* [ ] [S071 - JSF 3: CSS Styles & Templates](./src/m06_jakarta_ee/s071_jsf3_css_templates/)
* [ ] [S072 - JSF 3: i18n](./src/m06_jakarta_ee/s072_jsf3_i18n/)
* [ ] [S073 - JSF 3: PrimeFaces](./src/m06_jakarta_ee/s073_jsf3_primefaces/)

#### Web Services

* [ ] [S074 - SOAP Web Services (JAX-WS)](./src/m06_jakarta_ee/s074_soap_jax_ws/)
* [ ] [S075 - RESTful Web Services (JAX-RS)](./src/m06_jakarta_ee/s075_rest_jax_rs/)

#### Security (JAAS)

* [ ] [S076 - JAAS: AuthN/AuthZ Service](./src/m06_jakarta_ee/s076_jaas_authn_authz/)
* [ ] [S077 - JAAS in REST (JAX-RS)](./src/m06_jakarta_ee/s077_jaas_rest_jax_rs/)
* [ ] [S078 - JAAS in SOAP (JAX-WS)](./src/m06_jakarta_ee/s078_jaas_soap_jax_ws/)
* [ ] [S079 - JAAS in Remote EJB](./src/m06_jakarta_ee/s079_jaas_ejb_remote/)
* [ ] [S080 - JAAS: Programmatic Checks](./src/m06_jakarta_ee/s080_jaas_programmatic_checks/)

</details>

<details>
  <summary><strong>M07 - Spring Boot (Core)</strong> — <code>0/4</code> — <a href="./src/m07_spring_boot_core/">open folder</a></summary>

* [ ] [S081 - Spring Boot: Web Apps](./src/m07_spring_boot_core/s081_spring_webapps/)
* [ ] [S082 - Spring Boot: REST API](./src/m07_spring_boot_core/s082_spring_rest_api/)
* [ ] [S083 - Spring Boot: React App](./src/m07_spring_boot_core/s083_spring_react_app/)
* [ ] [S084 - Spring Boot: Angular App](./src/m07_spring_boot_core/s084_spring_angular_app/)

</details>

<details>
  <summary><strong>M08 - Reactive + Microservices + Realtime</strong> — <code>0/11</code> — <a href="./src/m08_reactive_microservices_realtime/">open folder</a></summary>

* [ ] [S085 - JavaFX](./src/m08_reactive_microservices_realtime/s085_javafx/)
* [ ] [S086 - WebSocket Chat (Angular)](./src/m08_reactive_microservices_realtime/s086_websocket_chat_angular/)
* [ ] [S087 - JavaFX: WebSocket Chat (Spring Boot)](./src/m08_reactive_microservices_realtime/s087_javafx_websocket_chat/)
* [ ] [S088 - Reactor: Reactive Streams (ReactiveX)](./src/m08_reactive_microservices_realtime/s088_reactor_reactive_streams/)
* [ ] [S089 - Spring WebFlux (Reactive Streams)](./src/m08_reactive_microservices_realtime/s089_spring_webflux/)
* [ ] [S090 - Spring Cloud: Microservices Intro](./src/m08_reactive_microservices_realtime/s090_spring_cloud_microservices_intro/)
* [ ] [S091 - Spring Cloud: Products Microservice](./src/m08_reactive_microservices_realtime/s091_spring_cloud_products_service/)
* [ ] [S092 - Spring Cloud: Items Microservice](./src/m08_reactive_microservices_realtime/s092_spring_cloud_items_service/)
* [ ] [S093 - Spring Cloud: Load Balancing + Inter-service Communication](./src/m08_reactive_microservices_realtime/s093_spring_cloud_load_balancing/)
* [ ] [S094 - Spring Cloud: Eureka Server](./src/m08_reactive_microservices_realtime/s094_spring_cloud_eureka_server/)
* [ ] [S095 - Spring Cloud Gateway](./src/m08_reactive_microservices_realtime/s095_spring_cloud_gateway/)

</details>

<details>
  <summary><strong>M09 - Spring Boot (Advanced)</strong> — <code>0/12</code> — <a href="./src/m09_spring_boot_advanced/">open folder</a></summary>

* [ ] [S096 - Eclipse Spring Tools (IDE)](./src/m09_spring_boot_advanced/s096_spring_tools_ide/)
* [ ] [S097 - Dependency Injection](./src/m09_spring_boot_advanced/s097_spring_dependency_injection/)
* [ ] [S098 - Forms](./src/m09_spring_boot_advanced/s098_spring_forms/)
* [ ] [S099 - Error Handling](./src/m09_spring_boot_advanced/s099_spring_error_handling/)
* [ ] [S100 - HTTP Interceptors](./src/m09_spring_boot_advanced/s100_spring_http_interceptors/)
* [ ] [S101 - Spring MVC + Data JPA: CRUD](./src/m09_spring_boot_advanced/s101_spring_mvc_data_jpa_crud/)
* [ ] [S102 - Invoicing System (Spring MVC + JPA + jQuery)](./src/m09_spring_boot_advanced/s102_spring_invoicing_system/)
* [ ] [S103 - Spring Security](./src/m09_spring_boot_advanced/s103_spring_security/)
* [ ] [S104 - i18n](./src/m09_spring_boot_advanced/s104_spring_i18n/)
* [ ] [S105 - View Technologies](./src/m09_spring_boot_advanced/s105_spring_view_technologies/)
* [ ] [S106 - Spring Security JWT](./src/m09_spring_boot_advanced/s106_spring_security_jwt/)
* [ ] [S107 - Thanks and Farewell](./src/m09_spring_boot_advanced/s107_thanks_farewell/)

</details>

---

## Links

* Hub: `../../README.md`
* Labs (practice): [https://github.com/v0idbuff3r/java-core-lab](https://github.com/v0idbuff3r/java-core-lab)
