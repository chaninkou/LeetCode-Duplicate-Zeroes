using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// using isa namespace
// Namespace grouping thing together
namespace Lesson1
{
	// Class (contains functionlity(for thing that you want to run)
	// Between class to the racket is scope
	class Program
	{
		// Function(entry point- where the program start)
		static void Main(string[] args)
		{
			PrintSomething();
			// ; is the same as java
			String sentence = "Hello this is C#";

			Console.WriteLine(sentence + " and + sign works in C#");

			Console.WriteLine("Type your lucky number");
			ConsoleKeyInfo key = Console.ReadKey();

			if (key.KeyChar == 'b')
			{
				Console.WriteLine("That is a letter 'b', please type a number");
			}
			else
			{
				// use {0}
				Console.WriteLine("\nDid you type {0}", key.KeyChar.ToString());
			}

		}

		static void PrintSomething()
		{
			Console.WriteLine("HEY");
		}
	}
}
