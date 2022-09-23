class BubbleSort:
    def __init__(self, arr:list=None) -> None:
        self.__arr = arr
        
    def sort(self, arr:list=None)->None:
        if(arr != None): self.__arr = arr
        
        for i in range(len(self.__arr)-1):
            for j in range(len(self.__arr)-i-1):
                if(self.__arr[j]> self.__arr[j+1]):
                    self.__swap(j, j+1)
    
    def __swap(self,j:int, i:int)->None:
        temp = self.__arr[j]
        self.__arr[j] = self.__arr[i]
        self.__arr[i] = temp
    
    def display(self)->None:
        if self.__arr == None: return
        print("[", end="")
        for index,i in enumerate(self.__arr):
            print(i, end= "" if(index == len(self.__arr)-1) else", " )
        print("]")