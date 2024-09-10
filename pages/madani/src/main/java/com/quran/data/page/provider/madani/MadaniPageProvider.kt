package com.quran.data.page.provider.madani

import com.quran.data.model.audio.Qari
import com.quran.data.pageinfo.common.MadaniDataSource
import com.quran.data.pageinfo.common.size.DefaultPageSizeCalculator
import com.quran.data.source.DisplaySize
import com.quran.data.source.PageProvider
import com.quran.data.source.PageSizeCalculator
import com.quran.labs.androidquran.pages.madani.R
import com.quran.labs.androidquran.common.audio.R as audioR

class MadaniPageProvider : PageProvider {

  override fun getDataSource() = dataSource

  override fun getPageSizeCalculator(displaySize: DisplaySize): PageSizeCalculator =
      DefaultPageSizeCalculator(displaySize)

  override fun getImageVersion() = 6

  override fun getImagesBaseUrl() = "$baseUrl/"

  override fun getImagesZipBaseUrl() = "$baseUrl/zips/"

  override fun getPatchBaseUrl() = "$baseUrl/patches/v"

  override fun getAyahInfoBaseUrl() = "$baseUrl/databases/ayahinfo/"

  override fun getAudioDirectoryName() = "audio"

  override fun getDatabaseDirectoryName() = "databases"

  override fun getAyahInfoDirectoryName() = getDatabaseDirectoryName()

  override fun getDatabasesBaseUrl() = "$baseUrl/databases/"

  override fun getAudioDatabasesBaseUrl() = getDatabasesBaseUrl() + "audio/"

  override fun getImagesDirectoryName() = ""

  override fun getPreviewTitle() = R.string.madani_title

  override fun getPreviewDescription() = R.string.madani_description

  override fun getDefaultQariId(): Int = 0

  override fun getQaris(): List<Qari> {
    return listOf(
      Qari(
        0,
        audioR.string.qari_minshawi_murattal_gapless,
        "https://download.quranicaudio.com/quran/muhammad_siddeeq_al-minshaawee/",
        "minshawi_murattal",
        false,
        "minshawi_murattal"
      ),
      Qari(
        1,
        audioR.string.qari_husary_gapless,
        "https://download.quranicaudio.com/quran/mahmood_khaleel_al-husaree/",
        "husary",
        false,
        "husary"
      ),
      Qari(
        2,
        audioR.string.qari_basfar,
        "https://mirrors.quranicaudio.com/everyayah/Abdullah_Basfar_192kbps/",
        "2",
        false,
        null
      ),Qari(
              3,
            audioR.string.qari_sudais_gapless,
            "https://download.quranicaudio.com/quran/abdurrahmaan_as-sudays/",
            "sudais_murattal",
            false,
            "sudais_murattal"
    ),
    Qari(
            4,
            audioR.string.qari_shuraym_gapless,
            "https://download.quranicaudio.com/quran/sa3ood_al-shuraym/",
            "shuraym",
            false,
            "shuraym"
    ),
    Qari(
            5,
            audioR.string.qari_muaiqly_haramain_gapless,
            "https://download.quranicaudio.com/quran/maher_256/",
            "maher_al_muaiqly",
            false,
            "maher_al_muaiqly"),
    Qari(
            6,
            audioR.string.qari_saad_al_ghamidi_gapless,
            "https://download.quranicaudio.com/quran/sa3d_al-ghaamidi/complete/",
            "sa3d_alghamidi",
            false,
            "sa3d_alghamidi"),

    Qari(
            7,
            audioR.string.qari_yasser_dussary_gapless,
            "https://download.quranicaudio.com/quran/yasser_ad-dussary/",
            "yasser_dussary",
            false,
            "yasser_dussary"),

    Qari(
            8,
            audioR.string.qari_afasy_gapless,
            "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasee/",
            "mishari_alafasy",
            false,
            "mishari_alafasy")/*,

    Qari(

            8,
            audioR.string.qari_afasy_gapless,
            "https://download.quranicaudio.com/quran/mishaari_raashid_al_3afaasee/",
            "mishari_alafasy",
            false,
            "mishari_alafasy")*/
    )
    

  }

  companion object {
    private const val baseUrl = "https://android.quran.com/data"
    private val dataSource by lazy { MadaniDataSource() }
  }
}
