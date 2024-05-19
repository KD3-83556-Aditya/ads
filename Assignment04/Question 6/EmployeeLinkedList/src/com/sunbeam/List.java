package com.sunbeam;

public class List {
    static class Node {
        private Employee employee;
        private Node next;
        private Node prev;

        public Node(Employee emp) {
            employee = emp;
            next = null;
            prev = null;
        }
    }

    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void deleteAll() {
        head = tail = null;
    }

    public void addFirst(Employee emp) {
        Node newnode = new Node(emp);
        if (isEmpty())
            head = tail = newnode;
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void addLast(Employee emp) {
        Node newnode = new Node(emp);
        if (isEmpty())
            head = tail = newnode;
        else {
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void deleteFirst() {
        if (isEmpty())
            return;
        else {
            head.next.prev = null;
            head = head.next;
        }
    }

    public void deleteLast() {
        if (isEmpty())
            return;
        else if (head == tail)
            head = tail = null;
        else {
            tail.prev.next = null;
            tail = tail.prev;
        }
    }

    public void displayAll() {
        Node trav = head;
        System.out.println("List : ");
        while (trav != null) {
            System.out.println(trav.employee);
            trav = trav.next;
        }
        System.out.println("");
    }

    public void searchEmployeeByName(String name) {
        Node trav = head;
        boolean found = false;
        while (trav != null) {
            if (trav.employee.getName().equals(name)) {
                System.out.println("Employee found: " + trav.employee);
                found = true;
                break;
            }
            trav = trav.next;
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployeeById(int empid) {
        if (isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        if (head.employee.getEmpid() == empid) {
            head = head.next;
            System.out.println("Employee deleted successfully.");
            return;
        }

        boolean found = false;


        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public void updateSalaryById(int empid, int newSalary) {
        Node trav = head;
        boolean found = false;
        while (trav != null) {
            if (trav.employee.getEmpid() == empid) {
                trav.employee.setSalary(newSalary);
                System.out.println("Salary updated successfully for employee: " + trav.employee);
                found = true;
                break;
            }
            trav = trav.next;
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
