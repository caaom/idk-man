import oshi.SystemInfo
import oshi.hardware.GraphicsCard
import oshi.hardware.CentralProcessor
import oshi.hardware.HardwareAbstractionLayer
import java.math.BigDecimal
import java.math.RoundingMode

object cpui {
	var model = ""
	var redblue = ""
}
object gpui {
	var vram = ""
	var model = ""
	var RedBlueGreen = ""
}
class idk {
	var distro = ""
	var kernel = ""
	val ram_usage = 0
}
val sys = idk()

fun GetGpu() {
	val si = SystemInfo()
	val hardware: HardwareAbstractionLayer = si.hardware
	val graphicsCards: List<GraphicsCard> = hardware.graphicsCards

	if (graphicsCards.isNotEmpty()) {
		graphicsCards.forEachIndexed { _, gpu ->
			val vramBytes = gpu.vRam
			val vramGib = vramBytes / (1024.0 * 1024.0 * 1024.0)
			gpui.vram = "Vram: ${String.format("%.2f", vramGib)} GiB"
			gpui.model = "gpu: ${gpu.name}"
			gpui.RedBlueGreen = "manufacturer: ${gpu.vendor}"
		}
	}
}
fun GetCpu() {
	val si = SystemInfo()
	val hardware: HardwareAbstractionLayer = si.hardware
	val processor: CentralProcessor = hardware.processor

	val hz1 = BigDecimal(processor.maxFreq)
	val hz = hz1.setScale(1, RoundingMode.CEILING)
	val GHz = hz.divide(BigDecimal(1000000000), RoundingMode.CEILING).toDouble()
	cpui.model = "cpu: ${processor.processorIdentifier.name} ${processor.physicalProcessorCount}(${processor.logicalProcessorCount}) ${GHz}GHz"
	cpui.redblue = "manufacturer: ${processor.processorIdentifier.vendor}"
}

fun main() {
	GetGpu()
	GetCpu()
	sys.distro = System.getProperty("os.name")
	sys.kernel = System.getProperty("os.version")
	println(sys.distro)
	println(sys.kernel)
	if (!gpui.model.isEmpty()) {
		println("━━━━━━━━━━━━━━━━━━━━━━━━")
		println(gpui.model + "\n" + gpui.RedBlueGreen + "\n" + gpui.vram)
	}
	println("━━━━━━━━━━━━━━━━━━━━━━━━")
	println(cpui.model + "\n" + cpui.redblue)
}
