using System.Runtime.InteropServices;

class Program 
{

    static void Main(String[] args)
    {   
        // Instanciar fabricas concretas
        FileConverterFactory docxTOPNGFactory = new DocxToPNGFactory();

        // Definir convertidor base
        IFileConverter fileConverter;

        int option;

        do
        {
            Console.WriteLine("Selecciona el convertidor:");
            Console.WriteLine("1. Docx a PNG");
            Console.WriteLine("0. Salir");

            option = Convert.ToInt32(Console.ReadLine());

            switch(option)
            {
                case 1:
                    // Usar fábrica concreta
                    fileConverter = docxTOPNGFactory.createFileConverter();
                    
                    Console.WriteLine("Nombre del archivo: ");
                    string fileName = Console.ReadLine();
                    fileConverter.Conversion(fileName);

                    break;
                case 0:
                    break;
                default:
                    Console.WriteLine("Opcion invalida");
                    break;
            }
        } while (option != 1);


    }
}
