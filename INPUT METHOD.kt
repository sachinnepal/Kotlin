fun main ()
{
    details()//function calling
}
fun details()
{
    println("Enter Your name  and Age ")
    val name =readln()//to take input
    val age = readln().toInt()
    println("The name is ${name.toString()} and age is $age  ")
}