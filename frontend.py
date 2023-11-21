import curses
from curses import *
from curses.textpad import *

def main(stdscr):
    # Clear screen
    stdscr.clear()

    stdscr.addstr(0, 0,"ivy864's Java Regex Tester")
    stdscr.addstr(1,0, "regex: ")

    begin_x = 7; begin_y = 1
    height = 1; width = curses.COLS-1-8

    regexWin = stdscr.subwin(height, width, begin_y, begin_x)
    
    
    stdscr.refresh()

    #box = TextBox(win);

    regexBox = Textbox(regexWin)
    regexBox.edit()

    stdscr.getkey()

wrapper(main)