class OpweratingSwitum {
	var Distwo = ""
	var Kerwal = ""
	var DwesktwopEnwaiorment = ""
}
val laptop = OpweratingSwitum()
val Desktop = OpweratingSwitum()

fun main() {
	Desktop.Distwo = "windows 11"
	Desktop.Kerwal = "windows nt 10.0.26100"
	Desktop.DwesktwopEnwaiorment = "windows 11"
	laptop.Distwo = "manjaro/arch"
	laptop.Kerwal = "linux 6.12.19-1"
	laptop.DwesktwopEnwaiorment = "KDE plasma"
	println("Laptop")
	println("━ ━ ━ ━")
	println("distro: ${laptop.Distwo}")
	println("kernel: ${laptop.Kerwal}")
	println("DE: ${laptop.DwesktwopEnwaiorment}")
	println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
	println("Desktop")
	println("━ ━ ━ ━")
	println("distro: ${Desktop.Distwo}")
	println("kernel: ${Desktop.Kerwal}")
	println("DE: ${Desktop.DwesktwopEnwaiorment}")
}