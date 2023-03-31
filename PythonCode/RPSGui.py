"""
File: RPSGui.py
"""
from breezypythongui import EasyFrame
import random

class RPS(EasyFrame):
    """Displays labels in the quadrants."""

    def __init__(self):
        """Sets up the window and the labels."""
        EasyFrame.__init__(self, title= "Rock Paper Scissors")    # Call the init of the parent class

        # Setting the size of the window
        self.setSize(200,200)
        # Change the background
        self.setBackground("grey")
        # New variables
        self.score = (0,0) #(Player, computer)
        self.choice_li = ["Rock", "Scissors", "Paper"]
        # Label
        self.move_lable = self.addLabel(text = "New Game",
                                        row = 0, column = 0,
                                        sticky= "NSEW", 
                                        background="black", foreground="white")
        self.score_lable = self.addLabel(text = "Player 0, Computer 0",
                                        row = 0, column = 1,
                                        sticky= "NSEW", 
                                        background="black", foreground="white", 
                                        columnspan=3)
        # Button
        self.addButton(text = "rock",
                        row=1, column=0,
                        command= self.rock)
        self.addButton(text = "paper",
                        row=1, column=1,
                        command= self.paper)
        self.addButton(text = "scissors",
                        row=1, column=2,
                        command= self.scissors)
    # Methods for buttons
    def rock(self):
            com_move = random.choice(self.choice_li)
            self.move_lable["text"] = com_move

            a,b = self.score

            if com_move[0].lower() == "r":
                self.score_lable["text"] = "Tie. Score: " + str(self.score)
            elif com_move[0].lower() == "p":
                    self.score_lable["text"] = "You Lose. Score: " + str((a,b + 1))
                    self.score = (a,b + 1)
            else:
                    self.score_lable["text"] = "YOu Win. Score: " + str((a + 1,b))
                    self.score = (a + 1,b)
        # pass

    def paper(self):
            com_move = random.choice(self.choice_li)
            self.move_lable["text"] = com_move

            a,b = self.score

            if com_move[0].lower() == "p":
                self.score_lable["text"] = "Tie. Score: " + str(self.score)
            elif com_move[0].lower() == "r":
                    self.score_lable["text"] = "You Lose. Score: " + str((a,b + 1))
                    self.score = (a,b + 1)
            else:
                    self.score_lable["text"] = "YOu Win. Score: " + str((a + 1,b))
                    self.score = (a + 1,b)

    def scissors(self):
            com_move = random.choice(self.choice_li)
            self.move_lable["text"] = com_move

            a,b = self.score

            if com_move[0].lower() == "s":
                self.score_lable["text"] = "Tie. Score: " + str(self.score)
            elif com_move[0].lower() == "r":
                    self.score_lable["text"] = "You Lose. Score: " + str((a,b + 1))
                    self.score = (a,b + 1)
            else:
                    self.score_lable["text"] = "YOu Win. Score: " + str((a + 1,b))
                    self.score = (a + 1,b)
def main():
    """Instantiate and pop up the window."""
    RPS().mainloop()

if __name__ == "__main__":
    main()