import oshi.SystemInfo
import oshi.hardware.GraphicsCard
import oshi.hardware.HardwareAbstractionLayer
object gpui {
	var vram = ""
	var model = ""
	var RedBlueGreen = ""
}
class idk {
	var distro = ""
	var kernel = ""
	var cpu = ""
	var gpu = ""
	val ram_usage = 0
}
val sys = idk()

fun GetGpu() {
	val si = SystemInfo()
	val hardware: HardwareAbstractionLayer = si.hardware
	val graphicsCards: List<GraphicsCard> = hardware.graphicsCards

	if (!graphicsCards.isEmpty()) {
		graphicsCards.forEachIndexed { index, gpu ->
			val vramBytes = gpu.vRam
			val vramGib = vramBytes / (1024.0 * 1024.0 * 1024.0)
			gpui.vram = "Vram: ${String.format("%.2f", vramGib)} GiB"
			gpui.model = "gpu: ${gpu.name}"
			gpui.RedBlueGreen = "manufacturer: ${gpu.vendor}"
		}
	}
	else {
		println("No graphics cards found.")
	}
}


fun main() {
	GetGpu()
	sys.distro = System.getProperty("os.name")
	sys.kernel = System.getProperty("os.version")
	println(sys.distro)
	println(sys.kernel)
	println("━━━━━━━━━━━━━━━━━━━━━━━━")
	println(gpui.model + "\n" + gpui.RedBlueGreen + "\n" + gpui.vram)
}