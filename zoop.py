from socket import *
import os
from pynput.keyboard import Key, Controller
keyboard = Controller()


host = "192.168.43.77"

sock = socket(AF_INET, SOCK_STREAM)
sock.bind((host, 9999))

sock.listen(10)

while True:
	conn, addr = sock.accept()
	val = conn.recv(1024).decode('utf-8')
	if(val == "escape"):
		keyboard.press(Key.esc)
		keyboard.release(Key.esc)
	elif(val == "ok"):
		keyboard.press(Key.enter)
		keyboard.release(Key.enter)
	elif(val == "right"):
		keyboard.press(Key.right)
		keyboard.release(Key.right)
	elif(val == "left"):
		keyboard.press(Key.left)
		keyboard.release(Key.left)
	elif(val == "power"):
		keyboard.press(Key.alt_l)
		keyboard.press(Key.f4)
		keyboard.release(Key.f4)
		keyboard.release(Key.alt_l)