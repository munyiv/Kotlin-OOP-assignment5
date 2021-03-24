fun main() {
    var food=Human("Audrey",19,55)
    food.eat(2)
    println(food.speech("I love writing code"))
    food.birthday()

    var person=user("Audrey","Munyiva","audreymunyiva@gmail.com","0795860190",786)
    println(person.firstName)
    println(person.phoneNumber)


}


class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food.")
        weight=weight+foodWeight
        println(weight)
    }
    fun speech(speech:String){
        println("$speech")
    }
    fun birthday(){
        age++
        println(age)

    }


}
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int)