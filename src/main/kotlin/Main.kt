fun main() {

Say("Kenya")
Say("Uganda")
Say("Rwanda")

stmt()

all(arrayOf("Omara","Anabo","Yuvy"))

}
fun Say(nationality:String){
    if(nationality=="Uganda"){
        println("Have you ever been to Kampala?")
    }
    else if(nationality=="Kenya"){
        println("Have you ever been to Nairobi?")
    }
    else if(nationality=="Rwanda"){
        println("Have you ever been to Kigali?")
    }


}



//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun give(){
    for (i in 1..100){
        if(i%2==0){
            println("Even")
        }
        else if(i%2!=0){
            println("Odd")
        }
        else{
            println(i)
        }
    }
}


//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun all(names:Array<String>){
    for (i in names){
        if(i.length<5) {
            println(i.length)
        }
        else{
            println(i)
        }
    }
}

//3. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun stmt(){
    for(i in 1..100){
        if(i%3===0 && i%5===0){
            println("FizzBuzz")

        }
        else if(i%5===0){
            println("Buzz")
        }
        else if(i%3===0){
            println("Fizz")
        }

    }
}