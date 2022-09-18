from typing import Any


class Node:
    def __init__(self, item:Any = None) -> None:
        self.item:Any = item
        self.next:Node = None