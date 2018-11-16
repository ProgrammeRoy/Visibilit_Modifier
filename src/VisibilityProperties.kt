open class VisibilityProperties {
    public var a:Int = 1
    internal var b:Int = 2
    protected var c:Int = 3
    private var d:Int = 4

    //We can see property protected
    var numProtected: Int = c

    //We can see property private
    var numPrivate: Int = d

}