import 'linked_list.dart';

void main(List<String> args) {
  LinkedList<int> linkedList = LinkedList();

  linkedList.append(5);
  linkedList.append(10);
  linkedList.append(15);
  linkedList.append(20);
  linkedList.insert(0);
  linkedList.display();
}
