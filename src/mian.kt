class idk {
	var distro = ""
	var kernel = ""
	var cpu = ""
	var gpu = ""
	var ram_usage = ""
}
val sys = idk()

fun main() {
	sys.distro = System.getProperty("os.name")
	sys.kernel = System.getProperty("os.version")
	sys.cpu = System.getProperty("os.arch")
	println(sys.distro)
	println(sys.kernel)
	println(sys.cpu)
	println(sys.gpu)
	println(sys.ram_usage)
}