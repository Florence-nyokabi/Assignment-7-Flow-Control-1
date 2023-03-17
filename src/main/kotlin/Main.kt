fun main(){
    // Invoking printOdd()
    printOdd()

    // Invoking stringArray
    println(stringArray(arrayOf("Flo", "Florence", "Nyokabi", "CodeHive", "age")))
    println(stringArray(arrayOf("wangui", "Kilimanjaro", "longonot", "Elgon", "joy")))


    // Invoking drinksRobot()
    drinksRobot(4)
    drinksRobot(16)
    drinksRobot(29)

    // Invoking fizzBuzz()
    fizzBuzz()


}

/*
Question 1

Create a function that prints out all the odd numbers between 1 and 100 (2pts)
*/

fun printOdd(){
    for(z in 1..100)
        if (z % 2 != 0){
            println(z)
        }
}


/*
Question 2

Create a function that takes in an array of names and returns the number of
names longer than 5 characters (2pts)
*/

fun stringArray(names: Array<String>): Int{
    var a = 0
    for(name in names)
        if (name.length > 5){
            a++
        }
    return a
}


/*
Question 3

You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca-cola. Create a function that will make these
decisions, printing out the name of the drink each person gets according to
their age. (2pts)

 */

fun drinksRobot(age: Int){
    when(age){
        in 0..6 -> println("Milk")
        in 7..15 -> println("Fanta Orange")
        else -> println("Coca-cola")
    }
}

/*
Question 4


Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number. (4pts)

 */

fun fizzBuzz(){
    for (x in 1..100)
        if(x % 3 == 0 && x % 5 == 0){
            println("FizzBuzz")
        }
        else if (x % 3 == 0){
            println("Fizz")
        }
        else if (x % 5 == 0){
            println("Buzz")
        }
    else{
        println(x)
    }
}