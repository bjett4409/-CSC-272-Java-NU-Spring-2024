class Term {
    int coefficient;
    int power;
    Term next;

    public Term(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
        this.next = null;
    }

    @Override
    public String toString() {
        if (power == 0) return String.valueOf(coefficient);
        if (power == 1) return coefficient + "x";
        return coefficient + "x^" + power;
    }
}

class Polynomial {
    private Term head;

    public Polynomial(Term term) {
        head = term;
    }

    public void add(Polynomial p) {
        Term t1 = head;
        Term t2 = p.head;
        Term prev = null;

        while (t1 != null && t2 != null) {
            if (t1.power == t2.power) {
                t1.coefficient += t2.coefficient;
                t2 = t2.next;
                prev = t1;
                t1 = t1.next;
            } else if (t1.power < t2.power) {
                Term newTerm = new Term(t2.coefficient, t2.power);
                newTerm.next = t1;
                if (prev == null) {
                    head = newTerm;
                } else {
                    prev.next = newTerm;
                }
                prev = newTerm;
                t2 = t2.next;
            } else {
                prev = t1;
                t1 = t1.next;
            }
        }

        while (t2 != null) {
            Term newTerm = new Term(t2.coefficient, t2.power);
            prev.next = newTerm;
            prev = newTerm;
            t2 = t2.next;
        }
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial(new Term(0, 0));
        for (Term t1 = head; t1 != null; t1 = t1.next) {
            Polynomial temp = new Polynomial(new Term(0, 0));
            for (Term t2 = p.head; t2 != null; t2 = t2.next) {
                temp.add(new Polynomial(new Term(t1.coefficient * t2.coefficient, t1.power + t2.power)));
            }
            result.add(temp);
        }
        return result;
    }

    public void print() {
        Term temp = head;
        while (temp != null) {
            if (temp.coefficient != 0) {
                System.out.print(temp + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(new Term(-10, 0));
        p.add(new Polynomial(new Term(-1, 1)));
        p.add(new Polynomial(new Term(9, 7)));
        p.add(new Polynomial(new Term(5, 10)));

        System.out.print("p(x) = ");
        p.print();

        Polynomial q = p.multiply(p);
        System.out.print("q(x) = p(x) * p(x) = ");
        q.print();
    }
}