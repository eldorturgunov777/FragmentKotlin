package com.example.fragmentkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R
import com.example.fragmentkotlin.adapter.PostAdapter
import com.example.fragmentkotlin.model.PostData

class ThreeFragment : Fragment() {
    var recyclerView3: RecyclerView? = null
    var layoutManager3: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<*>? = null
    private val list = mutableListOf<PostData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        recyclerView3 = view.findViewById(R.id.recyclerView3)
        layoutManager3 = LinearLayoutManager(requireContext())
        adapter = PostAdapter(list)
        recyclerView3?.setLayoutManager(layoutManager3)
        recyclerView3?.setAdapter(adapter)
        list()

        return view
    }

    fun list() {
        list.add(
            PostData(
                "Sovuq suv bilan chaying: mutaxassis yog‘li sochlar bilan uy sharoitida qanday kurashish kerakligini ma’lum qildi",
                "Agar soch har kuni yuvilsa, bosh terisi ko‘proq yog‘ ishlab chiqarishni boshlaydi"
            )
        )
        list.add(
            PostData(
                "Onlayn auksionda 50 777 ZZZ avtomobil raqami 669,6 mln so‘mga sotildi",
                "Ushbu avtoraqam 135 million so‘m boshlang‘ich narx bilan savdoga qo‘yilgan va savdolar davomida uning narxi 132 marta oshirilgan"
            )
        )
        list.add(
            PostData(
                "O‘zbekistonning eng daromadli banklar ro‘yxati ma’lum bo‘ldi",
                "Ko‘plab banklar davlatga tegishli va rivojlantirish tashkilotlar sifatida ish yuritadi"
            )
        )
        list.add(
            PostData(
                "Rasman: “Arsenal” Mikel Arteta bilan shartnomani uzaytirdi",
                "Kanonirlar” ispan mutaxassisiga ishonch bildirishda davom etadi"
            )
        )
        list.add(
            PostData(
                "O‘zbekistonda nogironlarning soliqqa tortilmaydigan daromadi miqdori oshirildi",
                "Endilikda bolalikdan nogiron bo‘lganlar, shuningdek, I va II guruh nogironlarining MHTEKMning 3 baravari miqdoridagi mablag‘lari daromad solig‘iga tortilmaydi"
            )
        )

    }
}