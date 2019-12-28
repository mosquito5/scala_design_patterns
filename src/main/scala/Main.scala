import builder.{Car, toCar}
object Main extends App {
  val car1 = toCar.setEngine(1998).setMake("Audi").setModel("A4").setPetrol("Diesel").setMileage(20000).build
  println(car1)
  println(car1.isInstanceOf[Car])
}
