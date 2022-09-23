class SelectionSort:
    def __init__(self, arr:list = None) -> None:
        self.__arr= arr
    
    def sort(self, arr:list=None)->None:
        if(arr != None): self.__arr = arr
        
        for i in range(0,len(self.__arr)):
            min = i
            for j in range(i, len(self.__arr)):
                
                if(self.__arr[min]> self.__arr[j]):
                    min = j
                    
            
            self.swap(i,min)
            
    
    
    def swap(self, i:int, min:int)->None:
        temp = self.__arr[i]
        self.__arr[i] = self.__arr[min]
        self.__arr[min] = temp
        
    def display(self)->None:
        if self.__arr == None: return
        print("[", end="")
        for index,i in enumerate(self.__arr):
            print(i, end= "" if(index == len(self.__arr)-1) else", " )
        print("]")