from turtle import Turtle

t = Turtle()

def drawFractalLine(distance, levels): 
    if levels == 0: 
        t.forward(distance) 
    else:  
        distancePerSide = distance / 3 
        drawFractalLine(distancePerSide, levels - 1) 
        t.right(60) 
        drawFractalLine(distancePerSide, levels - 1) 
        t.left(120) 
        drawFractalLine(distancePerSide, levels - 1) 
        t.right(60) 
        drawFractalLine(distancePerSide, levels - 1)

def main(): 
    levels = int(input(" Enter the level (0 or greater): ")) 
    distance = 200 
    for part in range(3):
        t.speed(0)
        drawFractalLine(distance, levels) 
        t.left(120)

if __name__ == "__main__":
    main()