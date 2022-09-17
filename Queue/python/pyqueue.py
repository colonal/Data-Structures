from typing import List,Any


class Queue():
      
  def __init__(self, MAX_SIZE =5) -> None:
    self.__array= [None for _ in range(MAX_SIZE)];
    self.__MAX_SIZE = MAX_SIZE
    self.__rear = MAX_SIZE -1
    self.__front = 0
    self.__count = 0
    
  def isEmpty(self)->bool:
    return self.__count == 0;
  
  def isFull(self)->bool:
    return self.__count == self.__MAX_SIZE;
  
  def enqueue(self,value)->None:
    if(self.isFull()):raise  Exception("Queue is Full")
            
    self.__rear = (self.__rear +1) % self.__MAX_SIZE
    self.__array[self.__rear] = value;
    self.__count += 1

  def dequeue(self)->None:
    if(self.isEmpty()):raise Exception("Queue is Empty")

    self.__array[self.__front] = None
    self.__front = (self.__front +1 )% self.__MAX_SIZE
    self.__count -= 1
    
  def getRear(self)->Any:
    return self.__rear

  def getFront(self)->Any:
    return self.__front

  def getSize(self)->int:
    return self.__count;

  def clear(self)->None:
    self.__array.clear()

  def desplay(self)->None:
        
    print("[" ,end="")
    i = self.__front
    while (i != self.__rear):
      
      print(self.__array[i],end=",")

      i = (i + 1)% self.__MAX_SIZE
    print(self.__array[self.__rear], end="]\n")

  def search(self, value)->None:
    i = self.__front
    pre = -1
    while (i != self.__rear):
      
      if(self.__array[i] == value):
        pre = i
        break
      

      i = (i + 1)% self.__MAX_SIZE

    if (pre == -1 and self.__array[self.__rear] == value):
      pre = self.__rear
    return pre
