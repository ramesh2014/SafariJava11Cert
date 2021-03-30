package typedecls2;


import typedecls.Ex1;

class Sub extends Ex1 {
  void doStuff() {
    System.out.println(this.prot);
  }
  void doStuff(Sub sub) {
    System.out.println(sub.prot);
  }
  void doStuff(Ex1 ex1) {
    // wrong reference type for access to a protected
//    System.out.println(ex1.prot);
  }
}