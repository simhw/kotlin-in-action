package ch05.GroupBy

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people.groupBy { it.age })
}