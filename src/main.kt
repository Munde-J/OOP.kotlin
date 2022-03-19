fun main(){
    //1.Create a class called Human with these attributes: name, age, weight. It has
    //the following functions:
    //-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
    //and increments the human’s weight by the weight of the food eaten

    //-speak(speech: String) :Prints the string passed to it                (2
    //points)
    //-birthday( ) :Increments the human’s age by 1(2
   // Create an instance of this human class and invoke all its functions
    var person = Human("Angel",20,60)
    var person2 = Human("Amor",20,55)
    person.eat(10)
    println(person.weight)
    person.birthday()

    person.speak("Good evening ladies and gentlemen")

    println(person2.name)
    println(person2.age)
    println(person2.weight)


    var trainer = teacher("Manuela","June","manuelajune@gmail.com",712345678,654321)
    var parent = teacher("Lourine","Liz","lourineliz@gmail.com",787654321,123456)
    println(trainer.firstName)
    println(trainer.lastName)
    println(trainer.email)
    println(trainer.phoneNumber)
    println(trainer.password)

    println(parent.lastName)
    println(parent.email)
   // 2.Create a data class User with these fields: firstName, lastName, email,
   // phoneNumber, password. Create an instance of User  and print out any 2
    //attributes
}
 class Human(var name:String,var age:Int,var weight:Int){

       fun eat(foodWeight:Int){
           println("I am eating $foodWeight kgs of food")
           weight+=foodWeight

       }
       fun speak(speech:String){
           println(speech)
       }

     fun birthday(){
         age+=1
         println(age)

     }
 }

data class teacher(var firstName:String,val lastName:String,val email:String,val phoneNumber:Int,val password:Int){

}

