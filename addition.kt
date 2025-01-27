fun main ()
{
    //addition
    add()
}
fun add()
{
    var firstnum=20
    var secondnum=30
    println("The sum of $firstnum and $secondnum is ${firstnum + secondnum}")
   //var can be reassigned
    firstnum=40
    secondnum=60
    println(firstnum)
    println(secondnum)
}