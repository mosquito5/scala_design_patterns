package builder

abstract class CarBuilder {
  var engine: Int
  var mileage: Int
  var petrol: String
  var make: String
  var model: String

  def setEngine(engine: Int): CarBuilder
  def setMileage(mileage: Int): CarBuilder
  def setPetrol(petrol: String): CarBuilder
  def setMake(make: String): CarBuilder
  def setModel(model: String): CarBuilder

  def build: Car
}

class Car(builder: CarBuilder) {
  private var engine: Int = builder.engine
  private var mileage: Int = builder.mileage
  private var petrol: String = builder.petrol
  private var make: String = builder.make
  private var model: String = builder.model

  override def toString = s"Car($engine, $mileage, $petrol, $make, $model)"
}

object toCar extends CarBuilder {
  override var engine: Int = 0
  override var mileage: Int = 0
  override var petrol: String = "none"
  override var make: String = "none"
  override var model: String = "none"

  override def setEngine(engine: Int): CarBuilder = {
    this.engine = engine
    this
  }

  override def setMileage(mileage: Int): CarBuilder = {
    this.mileage = mileage
    this
  }

  override def setPetrol(petrol: String): CarBuilder = {
    this.petrol = petrol
    this
  }

  override def setMake(make: String): CarBuilder = {
    this.make = make
    this
  }

  override def setModel(model: String): CarBuilder = {
    this.model = model
    this
  }

  override def build(): Car = {
    new Car(this)
  }
}
