class SpaceAge(object):
    def __init__(self, seconds):
        self.seconds = seconds
        self.years = seconds / 31557600

    def __age__(self, factor):
        return round(self.years / factor, 2)

    def on_mercury(self):
        return self.__age__(0.2408467)

    def on_venus(self):
        return self.__age__(0.61519726)

    def on_earth(self):
        return self.__age__(1)

    def on_mars(self):
        return self.__age__(1.8808158)

    def on_jupiter(self):
        return self.__age__(11.862615)

    def on_saturn(self):
        return self.__age__(29.447498)

    def on_uranus(self):
        return self.__age__(84.016846)

    def on_neptune(self):
        return self.__age__(164.79132)
