
class Car:
    def __init__(self, manufacturer, model, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f'{self.manufacturer}{self.model} is moving')

    def stop(self):
        print(f'{self.manufacturer}{self.model} has stopped')

Car1 = Car("MG", "WindSor","Manual", "Black")
Car2 = Car("Kia", "Syros", "Automatic", "White")
Car3 = Car("Tata", "Punch", "Manual", "Red")

Car1.accelerate()
Car1.stop()


