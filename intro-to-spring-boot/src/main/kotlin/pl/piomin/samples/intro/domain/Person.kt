package pl.piomin.samples.intro.domain

data class Person(val id: Int,
                  val firstName: String,
                  val lastName: String,
                  var age: Int,
                  val phone:String?=null
)