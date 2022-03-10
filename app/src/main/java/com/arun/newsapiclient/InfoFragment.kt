package com.arun.newsapiclient

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.arun.newsapiclient.databinding.FragmentInfoBinding
import com.arun.newsapiclient.presentation.viewmodel.NewsViewModel
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar

class InfoFragment : Fragment() {
    private lateinit var fragmentInfoBinding: FragmentInfoBinding
    private lateinit var viewModel : NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInfoBinding = FragmentInfoBinding.bind(view)
        val args : InfoFragmentArgs by navArgs()
        val article = args.selectedArticle

        Glide.with(fragmentInfoBinding.ivArticleImage.context)
            .load(article.urlToImage)
            .into(fragmentInfoBinding.ivArticleImage)
        fragmentInfoBinding.article = article

        viewModel=(activity as MainActivity).viewModel

        fragmentInfoBinding.fabSave.setOnClickListener {
           viewModel.saveArticle(article)
           Snackbar.make(view,"Saved Successfully!",Snackbar.LENGTH_LONG).show()
        }
    }
}







