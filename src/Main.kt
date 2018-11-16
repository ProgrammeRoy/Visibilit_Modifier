fun main(args: Array<String>){

    /*
    Property by default: public

    public    -> All visible
    internal  -> Solo accede desde el modulo del código
    protected -> Accesible desde la misma clase y desde las clases hijos
    private   -> Accesible desde la misma clase
   */

    //Declared and Initialize class Father
    var visi:VisibilityProperties = VisibilityProperties()

    println("Property public: " + visi.a)
    println("Property internal: " + visi.b)

    //Declared and Initialize class Son
    var visiSon:VisibilityPropertiesSon = VisibilityPropertiesSon()

    println(visiSon.numProtected2)

}