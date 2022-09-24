class InsertionSort:
    def __init__(self, arr: list = None) -> None:
        self.arr = arr

    def sort(self, arr: list = None) -> None:
        if (arr != None):
            self.arr = arr

        for i in range(1, len(self.arr)):
            key = self.arr[i]
            j = i-1
            while (j >= 0 and self.arr[j] > key):
                self.arr[j+1] = self.arr[j]
                j -= 1

            self.arr[j+1] = key

    def display(self) -> None:
        if self.arr == None:
            return
        print("[", end="")
        for index, i in enumerate(self.arr):
            print(i, end="" if (index == len(self.arr)-1) else ", ")
        print("]")
