using System;
using System.Collections.Generic;

namespace ListComparison
{
    class Program
    {
        static void Main(string[] args)
        {

            LinkedList<string> linkedList = new LinkedList<string>
            {
                // добавление элементов
                "Tom",
                "Alice",
                "Bob",
                "Sam"
            };

            // выводим элементы
            foreach (var item in linkedList)
            {
                Console.WriteLine(item);
            }


            // удаляем элемент
            linkedList.Remove("Alice");


            // проверяем наличие элемента
            bool isPresent = linkedList.Contains("Sam");
            Console.WriteLine(isPresent ? "Sam присутствует" : "Sam отсутствует");


            // добавляем элемент в начало            
            linkedList.AppendFirst("Bill");

            Console.WriteLine("\nList comparison:");
            List<string> people = new List<string>() { "Tom", "Alice", "Bob", "Sam" };
            foreach (var person in people)
            {
                Console.WriteLine(person);
            }


            people.Remove("Alice");

            var containsBob = people.Contains("Sam");
            Console.WriteLine(containsBob ? "Sam присутствует" : "Sam отсутствует");


            for(int i=0;i<1550;i++)
            {
                people.Insert(0, "Eugene");
            }


        }
    }
}
