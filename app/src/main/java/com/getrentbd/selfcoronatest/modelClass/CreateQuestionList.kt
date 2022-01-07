package com.getrentbd.selfcoronatest.modelClass

class CreateQuestionList {
    private var questionList: MutableList<Question> = ArrayList()
    private var result: MutableList<String> = ArrayList()
    private var coronaTestList: MutableList<EmerInforList> = ArrayList()
    private var hospitalList: MutableList<EmerInforList> = ArrayList()
    private var normalvsCoronas: MutableList<NormalvsCorona> = ArrayList()
    val qusetionList: List<Question>
        get() {
            questionList = ArrayList()
            questionList.add(Question("১.আপনি কি অসুস্থ বোধ করছেন?", "হ্যাঁ", "না", "0", "0"))
            questionList.add(
                Question(
                    "২. আপনার শরীরের তাপমাত্রা কি স্বাভাবিক এর চেয়ে বেশি?",
                    "হ্যাঁ",
                    "না",
                    "0",
                    "0"
                )
            )
            questionList.add(Question("৩. আপনার কি জ্বর আছে?", "হ্যাঁ", "না", "0", "0"))
            questionList.add(
                Question(
                    "৪. আপনার কি অনবরত শুকনো কাশি হচ্ছে?",
                    "হ্যাঁ",
                    "না",
                    "0",
                    "0"
                )
            )
            questionList.add(
                Question(
                    "৫. এই ধরণের কাশি কি আপনার পূর্বে ছিল ?",
                    "হ্যাঁ",
                    "না",
                    "0",
                    "0"
                )
            )
            questionList.add(Question("৬. আপনার কি গলা ব্যথা আছে ?", "হ্যাঁ", "না", "0", "0"))
            questionList.add(Question("৭. অতিরিক্ত মাথা ব্যথা আছে?", "হ্যাঁ", "না", "0", "0"))
            questionList.add(Question("৮. আপনার কি ডায়রিয়া হয় ?", "হ্যাঁ", "না", "মাঝেমাঝে", "0"))
            questionList.add(
                Question(
                    "৯. কোন পরিশ্রম না করেও কি আপনার শ্বাস নিতে কোন সমস্যা হচ্ছে?",
                    "হ্যাঁ",
                    "না",
                    "0",
                    "0"
                )
            )
            questionList.add(
                Question(
                    "১০. কখন থেকে আপনার এই লক্ষণ গুলো দেখা দিয়েছে?",
                    "১-৩ দিন",
                    "৪-৭ দিন",
                    "৮-১৫ দিন",
                    "না"
                )
            )
            return questionList
        }
    fun getResult(): List<String> {
        result = ArrayList()
        result.add("0A")
        result.add("1A")
        result.add("2A")
        result.add("3A")
        result.add("4A")
        result.add("5A")
        result.add("6A")
        result.add("7A")
        result.add("8A")
        result.add("9C")
        return result
    }

    fun getCoronaTestList(): List<EmerInforList> {
        coronaTestList = ArrayList()
        coronaTestList.add(
            EmerInforList(
                "রোগ নিয়ন্ত্রণ ও গবেষণা প্রতিষ্ঠান (আইইডিসিআর)",
                "029898796",
                "০২৯৮৯৮৭৯৬"
            )
        )
        coronaTestList.add(EmerInforList("জনস্বাস্থ্য ইনস্টিটিউট", "028821361", "০২৮৮২১৩৬১"))
        coronaTestList.add(
            EmerInforList(
                "শিশু স্বাস্থ্য গবেষণা ফাউন্ডেশন ",
                "0248110117",
                "০২৪৮১১০১১৭"
            )
        )
        coronaTestList.add(
            EmerInforList(
                "বাংলাদেশ ইনস্টিটিউট অব ট্রপিকাল এন্ড ইনফেকশাস ডিজিজেস",
                "0312780426",
                "০৩১২৭৮০৪২৬"
            )
        )
        coronaTestList.add(EmerInforList("আইসিডিডিআরবি", "09666771100", "০৯৬৬৬৭৭১১০০"))
        coronaTestList.add(
            EmerInforList(
                "ইনস্টিটিউট ফর ডেভলপিং সাইন্স এন্ড হেলথ ইনিশিয়েটিভ",
                "01793163304",
                "০১৭৯৩১৬৩৩০৪"
            )
        )
        coronaTestList.add(
            EmerInforList(
                "ন্যাশনাল ইনস্টিটিউট অব ল্যাবরেটরী মেডিসিন",
                "029139817",
                "০২৯১৩৯৮১৭"
            )
        )
        coronaTestList.add(EmerInforList("রংপুর মেডিকেল কলেজ", "052163388", "০৫২১৬৩৩৮৮"))
        coronaTestList.add(EmerInforList("রাজশাহী মেডিকেল কলেজ", "0255165088", "০২৫৫১৬৫০৮৮"))
        coronaTestList.add(EmerInforList("ঢাকা মেডিকেল কলেজ", "09166063", "০৯১৬৬০৬৩"))
        coronaTestList.add(EmerInforList("ময়মনসিংহ মেডিকেল কলেজ", "09166063", "০৯১৬৬০৬৩"))
        coronaTestList.add(EmerInforList("এমএজি ওসমানী মেডিকেল কলেজ", "0821713667", "০৮২১৭১৩৬৬৭"))
        coronaTestList.add(EmerInforList("খুলনা মেডিকেল কলেজ", "041760350", "০৪১৭৬০৩৫০"))
        coronaTestList.add(EmerInforList("শেরে বাংলা মেডিকেল কলেজ", "04312173547", "০৪৩১২১৭৩৫৪৭"))
        coronaTestList.add(EmerInforList("কক্সবাজার মেডিকেল কলেজ", "01821431144", "০১৮২১৪৩১১৪৪"))
        coronaTestList.add(
            EmerInforList(
                "আর্মড ফোর্সেস ইনস্টিটিউট অব প্যাথলজি",
                "01769016616",
                "০১৭৬৯০১৬৬১৬"
            )
        )
        coronaTestList.add(
            EmerInforList(
                "বঙ্গবন্ধু শেখ মুজিব মেডিকেল বিশ্ববিদ্যালয়",
                "01866637482",
                "০১৮৬৬৬৩৭৪৮২"
            )
        )
        return coronaTestList
    }


    val dhakaList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(
                EmerInforList(
                    "১। কুয়েত-বাংলাদেশ মৈত্রী সরকারি হাসপাতাল ",
                    " মন্ডল বাড়ি রোড,৩১৯ ঈশা খাঁ (রাজউক কলেজের পাশে),সেক্টর নং-৬, উত্তরা, ঢাকা-১২৩০।",
                    "+8801999956290"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "২। বাংলাদেশ রেলওয়ে জেনারেল হাসপাতাল",
                    "কমলাপুর আউটার র্সাকুলার রোড, মতিঝিল আইডিয়াল স্কুলের বিপরীতে, কমলাপুর, ঢাকা-১১০০",
                    "+880255007420"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৩। মহানগর জেনারেল হাসপাতাল ",
                    "নয়া বাজার, ইংলিশ রোড, মতিঝিল, ঢাকা-১১০০।",
                    " +8802-57390860 , +8802-7390066"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৪। মনিপুর মেটারনিটি হাসপাতাল ",
                    "মনিপুর রোড, বরবাগ, রোড নং-২, ঢাকা-১২১৬।",
                    "+08802-9002012"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৫। কামরাঙ্গিরচর ৩১ শয্যা বিশিষ্ট হাসপাতাল",
                    "লালবাগ, ঢাকা।",
                    "01726321189"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৬। আমিনবাজার ২০  শয্যা বিশিষ্ট হাসপাতাল",
                    "আমিনবাজার, সাভার।",
                    "+8801700000000, +8801712290100"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৭। জিঞ্জিরা ২০ শয্যা বিশিষ্ট হাসপাতাল",
                    "কেরানীগঞ্জ, ঢাকা।",
                    ""
                )
            )
            hospitalList.add(
                EmerInforList(
                    "৯। ঢাকা মেডিকেল কলেজ হাসপাতাল",
                    "ঢাকা-১০০০",
                    "+88028626812, +88028626813, +88028626814, +88028626815, +88028626816"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১০। জাতীয় বক্ষব্যাধি ইন্সটিটিউট ও হাসপাতাল।",
                    "মহাখালী, ঢাকা-১২১২",
                    "+8802-8811910"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১১। সংক্রামক ব্যাধি হাসপাতাল",
                    "মহাখালী বাস স্ট্যান্ড এর সামনে ,ঢাকা।",
                    "+88029899432, +8801313791116"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১২। কুর্মিটোলা জেনারেল হাসপাতাল",
                    "এমইএস বাস স্ট্যান্ড, হোটেল রেডিসনের বিপরীত পাশে, ঢাকা।",
                    "+880255062350, +880255062201, +88055062349"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১৩। জনস্বাস্থ্য ইনস্টিটিউট",
                    "মহাখালী, ঢাকা-১২১২",
                    " +88028821361"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১৪। শিশু স্বাস্থ্য গবেষণা ফাউন্ডেশন",
                    "মোহাম্মদপুর, ঢাকা-১২০৭",
                    "+880248110117"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১৫। ইনস্টিটিউট ফর ডেভলপিং সাইন্স এন্ড হেলথ ইনিশিয়েটিভ",
                    "মহাখালী, ঢাকা-১২১২",
                    "+8801793163304"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১৬। ন্যাশনাল ইনস্টিটিউট অব ল্যাবরেটরী মেডিসিন",
                    "আগারগাঁও শের-ই-বাংলা নগর, ঢাকা-১২০৭",
                    "+88029139817"
                )
            )
            hospitalList.add(EmerInforList("১৭। ঢাকা মেডিকেল কলেজ", "ঢাকা-১০০০", "+8809166063"))
            hospitalList.add(
                EmerInforList(
                    "১৮। আর্মড ফোর্সেস ইনস্টিটিউট  অব প্যাথলজি",
                    "শহীদ সরণী, ঢাকা-১২০৬",
                    "+8801769016616"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "১৯। বঙ্গবন্ধু শেখ মুজিব মেডিকেল বিশ্ববিদ্যালয়",
                    "কাজী নজরুল ইসলাম সরণি, ঢাকা-১০০০",
                    "+8801866637482"
                )
            )
            return hospitalList
        }
    val chitagongList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(
                EmerInforList(
                    "১।বাংলাদেশ ইনস্টিটিউট অব ট্রপিক্যাল এন্ড ইনফেকশাস ডিজিজেস",
                    "চট্টগ্রাম",
                    "+880312780426"
                )
            )
            hospitalList.add(
                EmerInforList(
                    "২।কক্সবাজার মেডিকেল কলেজ",
                    "কক্সবাজার",
                    "+8801821431144"
                )
            )
            return hospitalList
        }
    val rajshahiList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(
                EmerInforList(
                    "১।রাজশাহী মেডিকেল কলেজ",
                    "মেডিকেল রোড,রাজশাহী",
                    "+880255165088"
                )
            )
            return hospitalList
        }
    val khulnaList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(EmerInforList("১।খুলনা মেডিকেল কলেজ", "খুলনা", "+88041760350"))
            return hospitalList
        }
    val borishalList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(EmerInforList("১।শেরে বাংলা মেডিকেল কলেজ", "বরিশাল", "+8804312173547"))
            return hospitalList
        }
    val sylhetList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(
                EmerInforList(
                    "১।এমএজি ওসমানী মেডিকেল কলেজ",
                    "মেডিকেল কলেজ রোড,সিলেট",
                    "+880821713667"
                )
            )
            return hospitalList
        }
    val rangpurList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(EmerInforList("১।রংপুর মেডিকেল কলেজ", "রংপুর", "+88052163388"))
            return hospitalList
        }
    val maymansingList: List<EmerInforList>
        get() {
            hospitalList = ArrayList()
            hospitalList.add(EmerInforList("১।ময়মনসিংহ মেডিকেল কলেজ", "ময়মনসিংহ", "+8809166063"))
            return hospitalList
        }

    fun getNormalvsCoronas(): List<NormalvsCorona> {
        normalvsCoronas = ArrayList()
        normalvsCoronas.add(NormalvsCorona("জ্বর", "খুব কমন", "কদাচিৎ", "খুব কমন"))
        normalvsCoronas.add(NormalvsCorona("ক্লান্তি", "মাঝে মাঝে", "মাঝে মাঝে", "খুব কমন"))
        normalvsCoronas.add(NormalvsCorona("কাশি", "খুব কমন", "হালকা", "খুব কমন"))
        normalvsCoronas.add(NormalvsCorona("হাঁচি", "হয় না", "খুব কমন", "হয় না"))
        normalvsCoronas.add(NormalvsCorona("ব্যথা", "মাঝে মাঝে", "খুব কমন", "খুব কমন"))
        normalvsCoronas.add(NormalvsCorona("সর্দি", "কদাচিৎ", "খুব কমন", "মাঝে মাঝে"))
        normalvsCoronas.add(NormalvsCorona("গলা ব্যথা", "মাঝে মাঝে", "খুব কমন", "মাঝে মাঝে"))
        normalvsCoronas.add(NormalvsCorona("ডায়রিয়া", "কদাচিৎ", "হয় না", "মাঝে মাঝে"))
        normalvsCoronas.add(NormalvsCorona("মাথা ব্যথা", "মাঝে মাঝে", "কদাচিৎ", "খুব কমন"))
        normalvsCoronas.add(NormalvsCorona("শ্বাসকষ্ট", "কমন", "হয় না", "হয় না"))
        return normalvsCoronas
    }
}