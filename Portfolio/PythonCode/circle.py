from turtle import Turtle
import math
def drawCricle(t, x, y, radius):
    t.up()
    t.goto(x,y)
    t.forward(100)
    t.left(90)
    t.down()
    forwardGo = (2.0 * math.pi * radius)/120
    for _ in range(120):
        t.left(3)
        t.forward(forwardGo)

def main():
    t = Turtle()
    x = 50
    y = 75
    radius = 100
    drawCricle(t, x, y, radius)

if __name__ == "__main__":
    main()