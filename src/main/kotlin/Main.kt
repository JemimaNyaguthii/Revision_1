fun main() {
    school()
  var b =submit("Jemima",20)
    println(b)
    var a =length("functions")
    println(a)
    condition()

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
fun school() {
    var school = "akirachix"
    var prints = "${school[0]} ${school[2]} ${school [3]}"
        println(prints)
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun submit(name:String,age:Int):String{
    var  sentence=("Hi,my name is $name and I am $age years old" )
    return sentence
}
//Write a function that takes in a String and returns its length
fun length(word:String): Int{
    return word.length
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun condition(){
    var name= "Jemima"
    if(name=="Jemima"){
        println("That's me")
    }
        else{
            println("Thats not me")
        }
    }


