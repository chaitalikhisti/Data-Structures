using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringCompression
{
    class StringComp
    {

        static String Compress(String str)
        {
            String compressedSring = "";
            int value = 1;
            Hashtable hash = new Hashtable();
            for (int i = 0; i < str.Length; i++)
            {
                char tempChar = str[i];
                if (hash.ContainsKey(tempChar))
                {
                    value++;
                    hash[tempChar] = value;
                    //Console.WriteLine("For i: " +i+ " tempChar : " +tempChar+ " and value : " +value);
                }
                else
                {
                    value = 1;
                    hash.Add(tempChar, value);
                    //Console.WriteLine("For i: " + i + " tempChar : " + tempChar + " and value : " + value);
                }
            }
            foreach (DictionaryEntry entry in hash)
            {
                compressedSring += entry.Key+ "" + entry.Value;
            }
            return compressedSring;
        }

        static String Decompress(String str)
        {
            String decompressedString = "";
            int value;
            for (int i = 0; i < str.Length; i++)
            {
                if (i % 2 != 0)
                {
                    value = str[i] - '0';
                    //Console.WriteLine("i : " + i + " and value: " + value);
                    for (int j = 0; j < value; j++)
                    {
                        decompressedString += str[i - 1];
                    }
                }
            }
            return decompressedString;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("String Compression - Decompression");
            Console.Write("Enter String: ");
            String scannedString = Console.ReadLine();
            String compString = Compress(scannedString);
            Console.WriteLine("Compressed String: " +compString);
            Console.Write("Decompressed String: " + Decompress(compString));
        }
    }
}
