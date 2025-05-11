package com.example.jetpack_compose_assignment_1.data

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

val sampleCourses = listOf(
    Course("Introduction to Computer Science", "CS101", 3, "Fundamentals of computer science including hardware, software, and algorithms.", "None"),
    Course("Programming Fundamentals", "CS102", 4, "Basic programming concepts using modern programming languages.", "None"),
    Course("Data Structures", "CS201", 4, "In-depth study of lists, stacks, queues, trees, graphs, and algorithm analysis.", "CS102"),
    Course("Object-Oriented Programming", "CS202", 4, "Concepts of OOP such as classes, inheritance, polymorphism.", "CS102"),
    Course("Database Systems", "CS301", 3, "Introduction to relational databases, SQL, normalization, and transactions.", "CS201"),
    Course("Web Development", "CS302", 3, "Development of dynamic web applications using HTML, CSS, JS, and back-end tools.", "CS202"),
    Course("Mobile App Development", "CS303", 3, "Introduction to mobile development using Android and Kotlin.", "CS202"),
    Course("Operating Systems", "CS304", 3, "Processes, memory management, file systems, and concurrency.", "CS201"),
    Course("Computer Networks", "CS305", 3, "Network protocols, architecture, routing, and TCP/IP.", "CS201"),
    Course("Software Engineering", "CS306", 3, "Software development lifecycle, requirements, design, testing, and maintenance.", "CS202"),
    Course("Artificial Intelligence", "CS401", 3, "Search algorithms, knowledge representation, machine learning basics.", "CS201"),
    Course("Machine Learning", "CS402", 3, "Supervised and unsupervised learning, regression, classification, and clustering.", "CS401"),
    Course("Cybersecurity", "CS403", 3, "Security principles, cryptography, vulnerabilities, and threat modeling.", "CS305"),
    Course("Human-Computer Interaction", "CS404", 2, "Design and evaluation of user interfaces.", "CS202"),
    Course("Compiler Design", "CS405", 3, "Lexical analysis, parsing, code generation, and optimization.", "CS304"),
    Course("Cloud Computing", "CS406", 3, "Cloud models, virtualization, services, and deployment.", "CS305"),
    Course("Computer Graphics", "CS407", 3, "Rendering, transformations, modeling, and OpenGL.", "CS202"),
    Course("Data Mining", "CS408", 3, "Mining techniques, classification, association, and clustering.", "CS402"),
    Course("Big Data Analytics", "CS409", 3, "Processing and analysis of large-scale data using distributed systems.", "CS402"),
    Course("Parallel Programming", "CS410", 3, "Multithreading, concurrency, and parallel algorithms.", "CS304"),
    Course("Internet of Things (IoT)", "CS411", 3, "Sensors, networks, and IoT protocols for connected devices.", "CS305"),
    Course("Natural Language Processing", "CS412", 3, "Text processing, language models, sentiment analysis.", "CS401"),
    Course("Ethics in Computing", "CS413", 2, "Ethical issues, laws, and professional conduct in computing.", "None"),
    Course("Computer Architecture", "CS414", 3, "Digital logic, instruction sets, memory, and CPU design.", "CS101"),
    Course("Discrete Mathematics", "MATH201", 3, "Logic, set theory, combinatorics, graph theory, and proofs.", "None"),
    Course("Calculus I", "MATH101", 4, "Limits, derivatives, and integrals of single-variable functions.", "None"),
    Course("Calculus II", "MATH102", 4, "Integration techniques, sequences, and series.", "MATH101"),
    Course("Linear Algebra", "MATH202", 3, "Vectors, matrices, linear transformations, and systems of equations.", "MATH101"),
    Course("Statistics and Probability", "STAT301", 3, "Probability theory, distributions, and hypothesis testing.", "MATH102"),
    Course("Research Methods", "RES401", 2, "Scientific research, methodology, and report writing.", "None")
)