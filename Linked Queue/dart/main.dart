import 'queue.dart';

void main(List<String> args) {
  Queue<int> queue = Queue();

  queue.enqueue(1);
  queue.enqueue(2);
  queue.enqueue(3);
  queue.enqueue(4);
  queue.enqueue(5);
  queue.display();
  queue.dequeue();
  queue.dequeue();
  print(queue.getFront());
  print(queue.getRear());
  print(queue.getSize());
}
