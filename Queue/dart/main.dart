import 'queue.dart';

void main(List<String> args) {
  Queue<int> queue = Queue(MAX_SIZE: 5);

  queue.enqueue(10);
  queue.enqueue(15);
  queue.enqueue(20);
  queue.enqueue(25);

  print("Rear: ${queue.getRear()}");
  print("Front: ${queue.getFront()}");
  print("size: ${queue.getSize()}");

  queue.display();
}
