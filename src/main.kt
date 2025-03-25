class OpweratingSwitum {
	var distwo = ""
	var kerwal = ""
	var dwesktwopEnwaiorment = ""
}
val laptop = OpweratingSwitum()
val Desktop = OpweratingSwitum()

fun main() {
	Desktop.distwo = "windows 11"
	Desktop.kerwal = "windows nt 10.0.26100"
	Desktop.dwesktwopEnwaiorment = "windows 11"
	laptop.distwo = "manjaro/arch"
	laptop.kerwal = "linux 6.12.19-1"
	laptop.dwesktwopEnwaiorment = "KDE plasma"
	println("Laptop")
	println("━ ━ ━ ━")
	println("distro: ${laptop.distwo}")
	println("kernel: ${laptop.kerwal}")
	println("DE: ${laptop.dwesktwopEnwaiorment}")
	println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
	println("Desktop")
	println("━ ━ ━ ━")
	println("distro: ${Desktop.distwo}")
	println("kernel: ${Desktop.kerwal}")
	println("DE: ${Desktop.dwesktwopEnwaiorment}")
}