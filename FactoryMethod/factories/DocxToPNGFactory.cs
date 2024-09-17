class DocxToPNGFactory : FileConverterFactory 
{
    public IFileConverter createFileConverter() {
        return new DocxToPNGConverter();
    }
}