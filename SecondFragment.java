<html lang="en" dir="ltr"><head>
    <meta name="google-signin-client-id" content="721724668570-nbkv1cfusk7kk4eni4pjvepaus73b13t.apps.googleusercontent.com">
    <meta name="google-signin-scope" content="profile email https://www.googleapis.com/auth/developerprofiles https://www.googleapis.com/auth/developerprofiles.award">
    <meta property="og:site_name" content="Android Developers">
    <meta property="og:type" content="website"><meta name="theme-color" content="#34a853"><meta charset="utf-8">
    <meta content="IE=Edge" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    

    <link rel="manifest" href="/_pwa/android/manifest.json" crossorigin="use-credentials">
    <link rel="preconnect" href="//www.gstatic.com" crossorigin="">
    <link rel="preconnect" href="//fonts.gstatic.com" crossorigin="">
    <link rel="preconnect" href="//fonts.googleapis.com" crossorigin="">
    <link rel="preconnect" href="//apis.google.com" crossorigin="">
    <link rel="preconnect" href="//www.google-analytics.com" crossorigin=""><link rel="stylesheet" href="//fonts.googleapis.com/css?family=Google+Sans:400,500,600,700|Google+Sans+Text:400,400italic,500,500italic,600,600italic,700,700italic|Roboto+Mono:400,500,700&amp;display=swap">
      <link rel="stylesheet" href="//fonts.googleapis.com/css2?family=Material+Icons&amp;family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&amp;display=block"><link rel="stylesheet" href="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/css/app.css">
      <link rel="shortcut icon" href="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/favicon.png">
    <link rel="apple-touch-icon" href="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/touchicon-180.png"><link rel="canonical" href="https://developer.android.com/codelabs/build-your-first-android-app"><link rel="search" type="application/opensearchdescription+xml" title="Android Developers" href="https://developer.android.com/s/opensearch.xml">
      <link rel="alternate" hreflang="en" href="https://developer.android.com/codelabs/build-your-first-android-app"><link rel="alternate" hreflang="x-default" href="https://developer.android.com/codelabs/build-your-first-android-app"><title>Build Your First Android App in Java</title>

<meta property="og:title" content="Build Your First Android App in Java &nbsp;|&nbsp; Android Developers"><meta name="description" content="In this codelab, you’ll build your first Android app. You’ll learn how to use Android Studio to create an app, add UI elements, known as views, to your app, and add click handlers for the views. You’ll finish by adding a second screen to your app.">
  <meta property="og:description" content="In this codelab, you’ll build your first Android app. You’ll learn how to use Android Studio to create an app, add UI elements, known as views, to your app, and add click handlers for the views. You’ll finish by adding a second screen to your app."><meta property="og:url" content="https://developer.android.com/codelabs/build-your-first-android-app"><meta property="og:locale" content="en">
  <meta name="xsrf_token" content="pNb8RZFrRudrHnRSgGvgF1sR71f5q0zsXx6Q29Ho2ug6MTcxMDIxODQ5NjcyNzU5OQ">
  

  <meta name="session_expiry" content="1710222096">
  <meta name="uid" content="113423226603278874801">
  
    
    
    
    
    
    
    
    
  

    
      <link rel="stylesheet" href="/extras.css"><script src="https://apis.google.com/_/scs/abc-static/_/js/k=gapi.lb.en.8uXxGUoumbY.O/m=client/rt=j/sv=1/d=1/ed=1/rs=AHpOoo96qx3mL4tzGUOa-0q0udyPRqEAoA/cb=gapi.loaded_0?le=scs" nonce="" async=""></script><script type="text/javascript" async="" src="https://www.google-analytics.com/plugins/ua/linkid.js" nonce=""></script><script async="" src="//www.googletagmanager.com/gtag/js?id=G-JTFZSJVVVZ&amp;l=codelabDataLayer" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_app_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_app_custom_elements_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_a11y_announce_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_analytics_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_badger_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_book_nav_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_bookmark_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_code_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_content_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_cookie_notification_bar_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_feature_tooltip_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_footer_linkboxes_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_footer_promos_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_footer_utility_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_header_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_heading_link_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_language_selector_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_notification_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_panel_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_progress_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_recommendations_sidebar_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_search_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_sitemask_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_snackbar_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_toc_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_tooltip_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_user_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_google_codelab_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_google_codelab_about_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_google_codelab_analytics_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_google_codelab_step_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_android_fully_clickable_module.js" nonce=""></script><script src="//www.google-analytics.com/analytics.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_badge_awarded_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_dialog_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_fast_track_profile_creator_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_spinner_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_mwc_module.js" nonce=""></script><style type="text/css"></style><style type="text/css"></style><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_dropdown_list_module.js" nonce=""></script><script src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/devsite_devsite_checkbox_module.js" nonce=""></script><script type="text/javascript" charset="UTF-8" nonce="" src="https://apis.google.com/js/api.js" gapi_processed="true"></script></head>
  <body class="" template="codelab" theme="android-theme" type="codelab" layout="docs" display-toc="" ready="" codelabs-content-type="paginated" style="--devsite-js-header-height: 0px; --devsite-panel-height: 0px;" signed-in="">
    <devsite-progress id="app-progress"></devsite-progress>
  
    <section class="devsite-wrapper">
      
      <devsite-cookie-notification-bar><!----></devsite-cookie-notification-bar>
      <devsite-header role="banner" no-lower-row="" top-row--height="0" bottom-row--height="0" bottom-tabs--height="0" bottom-row--hidden="" fixed="" style="--devsite-js-top-row--height: 0px; --devsite-js-bottom-row--height: 0px; --devsite-js-bottom-tabs--height: 0px;">
  
    























<div class="devsite-header--inner nocontent">
  <div class="devsite-top-logo-row-wrapper-wrapper">
    <div class="devsite-top-logo-row-wrapper">
      <div class="devsite-top-logo-row">
        <button type="button" id="devsite-hamburger-menu" class="devsite-header-icon-button button-flat material-icons gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Navigation menu button" aria-label="Open menu">
        </button>
        <div class="devsite-product-name-wrapper">

  <a href="/" class="devsite-site-logo-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Site logo" track-type="globalNav" track-name="androidDevelopers" track-metadata-position="nav" track-metadata-eventdetail="nav">

  
    <img src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/lockup.svg" class="devsite-site-logo" alt="Android Developers">
  

</a>



</div>
        <div class="devsite-top-logo-row-middle">
          <div class="devsite-header-upper-tabs">
            
           </div>
          
<devsite-search enable-signin="" enable-search="" enable-suggestions="" enable-query-completion="" tenant-name="Android Developers">
  <form class="devsite-search-form" action="https://developer.android.com/s/results" method="GET">
    <div class="devsite-search-container">
      <button type="button" search-open="" class="devsite-search-button devsite-header-icon-button button-flat material-icons" aria-label="Open search"></button>
      <div class="devsite-searchbox">
        <input aria-activedescendant="" aria-autocomplete="list" aria-label="Search" aria-expanded="false" aria-haspopup="listbox" autocomplete="off" class="devsite-search-field devsite-search-query" name="q" placeholder="Search" role="combobox" type="text" value="" aria-controls="devsite-search-popout-container-id-1">
          <div class="devsite-search-image material-icons" aria-hidden="true">
            
          </div>
      </div>
    </div>
  <div class="devsite-popout" id="devsite-search-popout-container-id-1"><div class="devsite-popout-result devsite-suggest-results-container" devsite-hide=""></div></div></form>
  <button type="button" search-close="" class="devsite-search-button devsite-header-icon-button button-flat material-icons" aria-label="Close search"></button>
</devsite-search>

        <div class="devsite-search-background" style="opacity: 1;"></div></div>

        

        

        

        
<devsite-language-selector aria-label="Select your language preference.">
  <ul role="presentation">
    
    
    <li role="presentation">
      <a role="menuitem" lang="en" aria-current="true" href="https://developer.android.com/codelabs/build-your-first-android-app#5">English</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="es-419" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=es-419#5">Español – América Latina</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="id" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=id#5">Indonesia</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="pt-br" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=pt-br#5">Português – Brasil</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="zh-cn" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=zh-cn#5">中文 – 简体</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ja" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ja#5">日本語</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ko" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ko#5">한국어</a>
    </li>
    
  </ul>
</devsite-language-selector>


        
          
  <a class="devsite-header-link devsite-top-button button gc-analytics-event" href="https://developer.android.com/studio" data-category="Site-Wide Custom Events" data-label="Site header link">
    Android Studio
  </a>
  
        

        
          
          
          <devsite-user signed-in="" enable-profiles="" id="devsite-user" sign-in-url="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account" sign-out-url="https://developer.android.com/_d/signout?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235" url="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account"><div class="ogb-wrapper ogb-si"><div class="devsite-devprofile-wrapper show"><devsite-feature-tooltip ack-key="AckViewSavedPagesPopoutDismiss" id="devsite-view-saved-pages" close-button-href="" close-button-text="View" dismiss-button="" managed="" ready="" current-step="0" style="--devsite-popout-offset-x: 32px;"><button class="devsite-devprofile-button" aria-controls="devsite-devprofile-popout" aria-expanded="false" aria-haspopup="true" aria-label="Open Google Developer Profile" data-tooltip="Google Developer Profile"><svg width="4" height="16" viewBox="0 0 4 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M2 4C3.1 4 4 3.1 4 2C4 0.9 3.1 0 2 0C0.9 0 0 0.9 0 2C0 3.1 0.9 4 2 4ZM2 6C0.9 6 0 6.9 0 8C0 9.1 0.9 10 2 10C3.1 10 4 9.1 4 8C4 6.9 3.1 6 2 6ZM0 14C0 12.9 0.9 12 2 12C3.1 12 4 12.9 4 14C4 15.1 3.1 16 2 16C0.9 16 0 15.1 0 14Z" fill="#5F6368"></path></svg></button><span slot="popout-heading">Google Developer Profile</span><span slot="popout-contents">View your saved pages and finish your Google Developer Profile setup here.</span></devsite-feature-tooltip><div id="devsite-devprofile-popout" class="devsite-devprofile-popout" role="menu" aria-label="Google Developer Profile"></div></div><div class="devsite-user-dialog-signin">
  <a href="#" class="devsite-user-dialog-toggle devsite-top-button" role="button" aria-label="Open account dialog">
  
    <span class="devsite-user-dialog-letter">J</span>
  
  </a>
</div>

<div class="devsite-user-dialog" role="dialog" aria-modal="true" aria-label="Account Information" aria-hidden="true">
  <button class="devsite-user-dialog-exit" aria-label="Close menu">
    <svg width="22" height="22" viewBox="1 1 22 22">
      <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41z">
      </path>
    </svg>
  </button>
  <div class="devsite-user-dialog-email">jcdamo@gmail.com</div>
  
  <div class="devsite-user-dialog-photo">
  
    <span class="devsite-user-dialog-letter">J</span>
  
  </div>
  <div class="devsite-user-dialog-details">
    
    <div class="devsite-user-dialog-name">
      
       Hi, Joette!</div>
    
    <a class="devsite-user-manage" href="https://myaccount.google.com/?utm_source=OGB&amp;amp;utm_medium=act" target="_blank" aria-label="Manage your Google Account (opens a new tab)">
      
      Manage your Google Account
    </a>
  </div>
  <div class="devsite-user-dialog-buttons">
    <a class="devsite-user-signin" href="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account" target="_top">
      <svg width="21" height="21" viewBox="0 0 24 24">
        <path d="M20 13h-7v7h-2v-7H4v-2h7V4h2v7h7v2z"></path>
      </svg>
      
      Switch account
    </a>

    <a class="devsite-user-signout" href="https://developer.android.com/_d/signout?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235" target="_top">
      <svg height="24" viewBox="0 0 24 24" width="24">
        <path d="M17 7l-1.41 1.41L18.17 11H8v2h10.17l-2.58 2.58L17 17l5-5zM4 5h8V3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8v-2H4V5z">
        </path><path d="M0 0h24v24H0z" fill="none"></path>
      </svg>
      
      Sign out
    </a>
  </div>

  <div class="devsite-user-dialog-footer">
    <div class="devsite-user-dialog-footer-link">
      <a href="https://myaccount.google.com/privacypolicy" target="_blank">
        
        Privacy Policy
      </a>
    </div>

    <div class="devsite-user-dialog-footer-link">
      <a href="https://myaccount.google.com/termsofservice" target="_blank">
        
        Terms of Service
      </a>
    </div>
  </div>
</div></div></devsite-user>
           
        
      </div>
    </div>
  </div>



</div>



  
</devsite-header>
      <div class="devsite-book-nav-bg" hidden="" fixed=""></div><devsite-book-nav scrollbars="" hidden="" top-level-nav="" fixed="" style="top: 0px; max-height: 703px;">
        
          





















<div class="devsite-book-nav-filter
            hidden">
  <span class="filter-list-icon material-icons" aria-hidden="true"></span>
  <input type="text" placeholder="Filter" aria-label="Type to filter" role="searchbox">
  
  <span class="filter-clear-button hidden" data-title="Clear filter" aria-label="Clear filter" role="button" tabindex="0"></span>
</div>

<nav class="devsite-book-nav devsite-nav nocontent" aria-label="Side menu">
  <div class="devsite-mobile-header">
    <button type="button" id="devsite-close-nav" class="devsite-header-icon-button button-flat material-icons gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Close navigation" aria-label="Close navigation">
    </button>
    <div class="devsite-product-name-wrapper">

  <a href="/" class="devsite-site-logo-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Site logo" track-type="globalNav" track-name="androidDevelopers" track-metadata-position="nav" track-metadata-eventdetail="nav">

  
    <img src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/lockup.svg" class="devsite-site-logo" alt="Android Developers">
  

</a>


</div>
  </div>

  <div class="devsite-book-nav-wrapper">
    <div class="devsite-mobile-nav-top">
      
        <ul class="devsite-nav-list">
          
          
    
<li class="devsite-nav-item">

  
  <a href="/studio" class="devsite-nav-title gc-analytics-event
              
              " data-category="Site-Wide Custom Events" data-label="Responsive Tab: Android Studio" track-type="navMenu" track-metadata-eventdetail="globalMenu" track-metadata-position="nav">
  
    <span class="devsite-nav-text" tooltip="">
      Android Studio
   </span>
    
  
  </a>
  

</li>

  
          
        </ul>
      
    </div>
    
  </div>
</nav>
        
      </devsite-book-nav><div class="devsite-book-nav-blur" hidden="" fixed="" style="--devsite-js-book-nav-scrollbar-width: 0px;"></div><button class="devsite-book-nav-toggle" aria-haspopup="menu" hidden="" aria-label="Hide side navigation" data-title="Hide side navigation" aria-expanded="true" fixed=""><span class="material-icons devsite-book-nav-toggle-icon"></span></button>
      <section id="gc-wrapper" style="margin-top: 0px;">
        <main role="main" class="devsite-main-content" has-sidebar="">
          
          
          <div class="devsite-sidebar" fixed="" style="--devsite-js-sidebar-max-height: 655px; --devsite-js-sidebar-max-width: 251.60000610351562px; --devsite-js-sidebar-offset: 0;">
            <div class="devsite-sidebar-content">
                
                <devsite-toc class="devsite-nav devsite-toc" role="navigation" aria-label="On this page" depth="1" scrollbars="" visible=""><ul class="devsite-nav-list"><li class="devsite-nav-item devsite-nav-heading devsite-toc-toggle"><span class="devsite-nav-title" role="heading" aria-level="2"><span class="devsite-nav-text">On this page</span></span></li><li class="devsite-nav-item"><a href="#0" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="0" track-type="navigation" track-name="rightNav" track-metadata-position="0" track-metadata-link-destination="#0"><span class="devsite-nav-text" tooltip="">Welcome!</span></a></li><li class="devsite-nav-item"><a href="#what-you-must-know-already" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="1" track-type="navigation" track-name="rightNav" track-metadata-position="1" track-metadata-link-destination="#what-you-must-know-already"><span class="devsite-nav-text" tooltip="">What you must know already</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="2" track-type="navigation" track-name="rightNav" track-metadata-position="2" track-metadata-link-destination="#what-youll-learn"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#use-android-studio-and-java-to-write-android-apps" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="3" track-type="navigation" track-name="rightNav" track-metadata-position="3" track-metadata-link-destination="#use-android-studio-and-java-to-write-android-apps"><span class="devsite-nav-text" tooltip="">Use Android Studio and Java to write Android apps</span></a></li><li class="devsite-nav-item"><a href="#1" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="4" track-type="navigation" track-name="rightNav" track-metadata-position="4" track-metadata-link-destination="#1"><span class="devsite-nav-text" tooltip="">Install Android Studio</span></a></li><li class="devsite-nav-item"><a href="#2" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="5" track-type="navigation" track-name="rightNav" track-metadata-position="5" track-metadata-link-destination="#2"><span class="devsite-nav-text" tooltip="">Task: Create your first project</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_1" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="6" track-type="navigation" track-name="rightNav" track-metadata-position="6" track-metadata-link-destination="#what-youll-learn_1"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-create-a-new-project" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="7" track-type="navigation" track-name="rightNav" track-metadata-position="7" track-metadata-link-destination="#step-1:-create-a-new-project"><span class="devsite-nav-text" tooltip="">Step 1: Create a new project</span></a></li><li class="devsite-nav-item"><a href="#step-2:-get-your-screen-set-up" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="8" track-type="navigation" track-name="rightNav" track-metadata-position="8" track-metadata-link-destination="#step-2:-get-your-screen-set-up"><span class="devsite-nav-text" tooltip="">Step 2: Get your screen set up</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-the-project-structure-and-layout" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="9" track-type="navigation" track-name="rightNav" track-metadata-position="9" track-metadata-link-destination="#step-3:-explore-the-project-structure-and-layout"><span class="devsite-nav-text" tooltip="">Step 3: Explore the project structure and layout</span></a></li><li class="devsite-nav-item"><a href="#step-4:-create-a-virtual-device-emulator" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="10" track-type="navigation" track-name="rightNav" track-metadata-position="10" track-metadata-link-destination="#step-4:-create-a-virtual-device-emulator"><span class="devsite-nav-text" tooltip="">Step 4: Create a virtual device (emulator)</span></a></li><li class="devsite-nav-item"><a href="#step-5:-run-your-app-on-your-new-emulator" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="11" track-type="navigation" track-name="rightNav" track-metadata-position="11" track-metadata-link-destination="#step-5:-run-your-app-on-your-new-emulator"><span class="devsite-nav-text" tooltip="">Step 5: Run your app on your new emulator</span></a></li><li class="devsite-nav-item"><a href="#step-6:-run-your-app-on-a-device-if-you-have-one" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="12" track-type="navigation" track-name="rightNav" track-metadata-position="12" track-metadata-link-destination="#step-6:-run-your-app-on-a-device-if-you-have-one"><span class="devsite-nav-text" tooltip="">Step 6: Run your app on a device (if you have one)</span></a></li><li class="devsite-nav-item"><a href="#troubleshooting" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="13" track-type="navigation" track-name="rightNav" track-metadata-position="13" track-metadata-link-destination="#troubleshooting"><span class="devsite-nav-text" tooltip="">Troubleshooting</span></a></li><li class="devsite-nav-item"><a href="#step-7:-explore-the-app-template" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="14" track-type="navigation" track-name="rightNav" track-metadata-position="14" track-metadata-link-destination="#step-7:-explore-the-app-template"><span class="devsite-nav-text" tooltip="">Step 7: Explore the app template</span></a></li><li class="devsite-nav-item"><a href="#3" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="15" track-type="navigation" track-name="rightNav" track-metadata-position="15" track-metadata-link-destination="#3"><span class="devsite-nav-text" tooltip="">Task: Explore the layout editor</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_2" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="16" track-type="navigation" track-name="rightNav" track-metadata-position="16" track-metadata-link-destination="#what-youll-learn_2"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-open-the-layout-editor" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="17" track-type="navigation" track-name="rightNav" track-metadata-position="17" track-metadata-link-destination="#step-1:-open-the-layout-editor"><span class="devsite-nav-text" tooltip="">Step 1: Open the layout editor</span></a></li><li class="devsite-nav-item"><a href="#step-2:-explore-and-resize-the-component-tree" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="18" track-type="navigation" track-name="rightNav" track-metadata-position="18" track-metadata-link-destination="#step-2:-explore-and-resize-the-component-tree"><span class="devsite-nav-text" tooltip="">Step 2: Explore and resize the Component Tree</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-view-hierarchies" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="19" track-type="navigation" track-name="rightNav" track-metadata-position="19" track-metadata-link-destination="#step-3:-explore-view-hierarchies"><span class="devsite-nav-text" tooltip="">Step 3: Explore view hierarchies</span></a></li><li class="devsite-nav-item"><a href="#step-4:-change-property-values" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="20" track-type="navigation" track-name="rightNav" track-metadata-position="20" track-metadata-link-destination="#step-4:-change-property-values"><span class="devsite-nav-text" tooltip="">Step 4: Change property values</span></a></li><li class="devsite-nav-item"><a href="#step-5:-change-text-display-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="21" track-type="navigation" track-name="rightNav" track-metadata-position="21" track-metadata-link-destination="#step-5:-change-text-display-properties"><span class="devsite-nav-text" tooltip="">Step 5: Change text display properties</span></a></li><li class="devsite-nav-item"><a href="#step-6:-display-all-attributes" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="22" track-type="navigation" track-name="rightNav" track-metadata-position="22" track-metadata-link-destination="#step-6:-display-all-attributes"><span class="devsite-nav-text" tooltip="">Step 6: Display all attributes</span></a></li><li class="devsite-nav-item"><a href="#4" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="23" track-type="navigation" track-name="rightNav" track-metadata-position="23" track-metadata-link-destination="#4"><span class="devsite-nav-text" tooltip="">Task: Add color resources</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_3" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="24" track-type="navigation" track-name="rightNav" track-metadata-position="24" track-metadata-link-destination="#what-youll-learn_3"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-color-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="25" track-type="navigation" track-name="rightNav" track-metadata-position="25" track-metadata-link-destination="#step-1:-add-color-resources"><span class="devsite-nav-text" tooltip="">Step 1: Add color resources</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-a-new-color-to-use-as-the-screen-background-color" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="26" track-type="navigation" track-name="rightNav" track-metadata-position="26" track-metadata-link-destination="#step-2:-add-a-new-color-to-use-as-the-screen-background-color"><span class="devsite-nav-text" tooltip="">Step 2: Add a new color to use as the screen background color</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-width-and-height-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="27" track-type="navigation" track-name="rightNav" track-metadata-position="27" track-metadata-link-destination="#step-3:-explore-width-and-height-properties"><span class="devsite-nav-text" tooltip="">Step 3: Explore width and height properties</span></a></li><li class="devsite-nav-item"><a href="#5" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="28" track-type="navigation" track-name="rightNav" track-metadata-position="28" track-metadata-link-destination="#5"><span class="devsite-nav-text" tooltip="">Task: Add views and constraints</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_4" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="29" track-type="navigation" track-name="rightNav" track-metadata-position="29" track-metadata-link-destination="#what-youll-learn_4"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-view-constraint-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="30" track-type="navigation" track-name="rightNav" track-metadata-position="30" track-metadata-link-destination="#step-1:-view-constraint-properties"><span class="devsite-nav-text" tooltip="">Step 1: View constraint properties</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-buttons-and-constrain-their-positions" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="31" track-type="navigation" track-name="rightNav" track-metadata-position="31" track-metadata-link-destination="#step-2:-add-buttons-and-constrain-their-positions"><span class="devsite-nav-text" tooltip="">Step 2: Add buttons and constrain their positions</span></a></li><li class="devsite-nav-item"><a href="#step-3:-add-a-constraint-to-the-new-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="32" track-type="navigation" track-name="rightNav" track-metadata-position="32" track-metadata-link-destination="#step-3:-add-a-constraint-to-the-new-button"><span class="devsite-nav-text" tooltip="">Step 3: Add a constraint to the new button</span></a></li><li class="devsite-nav-item"><a href="#step-4:-adjust-the-next-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="33" track-type="navigation" track-name="rightNav" track-metadata-position="33" track-metadata-link-destination="#step-4:-adjust-the-next-button"><span class="devsite-nav-text" tooltip="">Step 4: Adjust the Next button</span></a></li><li class="devsite-nav-item"><a href="#step-5:-delete-the-chain-constraints" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="34" track-type="navigation" track-name="rightNav" track-metadata-position="34" track-metadata-link-destination="#step-5:-delete-the-chain-constraints"><span class="devsite-nav-text" tooltip="">Step 5: Delete the chain constraints</span></a></li><li class="devsite-nav-item"><a href="#step-6:-add-new-constraints" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="35" track-type="navigation" track-name="rightNav" track-metadata-position="35" track-metadata-link-destination="#step-6:-add-new-constraints"><span class="devsite-nav-text" tooltip="">Step 6: Add new constraints</span></a></li><li class="devsite-nav-item"><a href="#step-7:-extract-string-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="36" track-type="navigation" track-name="rightNav" track-metadata-position="36" track-metadata-link-destination="#step-7:-extract-string-resources"><span class="devsite-nav-text" tooltip="">Step 7: Extract string resources</span></a></li><li class="devsite-nav-item"><a href="#step-8:-update-the-next-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="37" track-type="navigation" track-name="rightNav" track-metadata-position="37" track-metadata-link-destination="#step-8:-update-the-next-button"><span class="devsite-nav-text" tooltip="">Step 8: Update the Next button</span></a></li><li class="devsite-nav-item"><a href="#step-9:-add-a-third-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="38" track-type="navigation" track-name="rightNav" track-metadata-position="38" track-metadata-link-destination="#step-9:-add-a-third-button"><span class="devsite-nav-text" tooltip="">Step 9: Add a third button</span></a></li><li class="devsite-nav-item"><a href="#step-10:-get-your-ui-ready-for-the-next-task" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="39" track-type="navigation" track-name="rightNav" track-metadata-position="39" track-metadata-link-destination="#step-10:-get-your-ui-ready-for-the-next-task"><span class="devsite-nav-text" tooltip="">Step 10: Get your UI ready for the next task</span></a></li><li class="devsite-nav-item"><a href="#step-11:-fix-errors-if-necessary" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="40" track-type="navigation" track-name="rightNav" track-metadata-position="40" track-metadata-link-destination="#step-11:-fix-errors-if-necessary"><span class="devsite-nav-text" tooltip="">Step 11: Fix errors if necessary</span></a></li><li class="devsite-nav-item"><a href="#6" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="41" track-type="navigation" track-name="rightNav" track-metadata-position="41" track-metadata-link-destination="#6"><span class="devsite-nav-text" tooltip="">Task: Update the appearance of the buttons and the TextView</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-new-color-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="42" track-type="navigation" track-name="rightNav" track-metadata-position="42" track-metadata-link-destination="#step-1:-add-new-color-resources"><span class="devsite-nav-text" tooltip="">Step 1: Add new color resources</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-a-background-color-for-the-buttons" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="43" track-type="navigation" track-name="rightNav" track-metadata-position="43" track-metadata-link-destination="#step-2:-add-a-background-color-for-the-buttons"><span class="devsite-nav-text" tooltip="">Step 2: Add a background color for the buttons</span></a></li><li class="devsite-nav-item"><a href="#step-3:-change-the-margins-of-the-left-and-right-buttons" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="44" track-type="navigation" track-name="rightNav" track-metadata-position="44" track-metadata-link-destination="#step-3:-change-the-margins-of-the-left-and-right-buttons"><span class="devsite-nav-text" tooltip="">Step 3: Change the margins of the left and right buttons</span></a></li><li class="devsite-nav-item"><a href="#step-4:-update-the-appearance-of-the-textview" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="45" track-type="navigation" track-name="rightNav" track-metadata-position="45" track-metadata-link-destination="#step-4:-update-the-appearance-of-the-textview"><span class="devsite-nav-text" tooltip="">Step 4: Update the appearance of the TextView</span></a></li><li class="devsite-nav-item"><a href="#step-5:-run-your-app" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="46" track-type="navigation" track-name="rightNav" track-metadata-position="46" track-metadata-link-destination="#step-5:-run-your-app"><span class="devsite-nav-text" tooltip="">Step 5: Run your app</span></a></li><li class="devsite-nav-item"><a href="#7" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="47" track-type="navigation" track-name="rightNav" track-metadata-position="47" track-metadata-link-destination="#7"><span class="devsite-nav-text" tooltip="">Task: Make your app interactive</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_5" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="48" track-type="navigation" track-name="rightNav" track-metadata-position="48" track-metadata-link-destination="#what-youll-learn_5"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-enable-auto-imports" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="49" track-type="navigation" track-name="rightNav" track-metadata-position="49" track-metadata-link-destination="#step-1:-enable-auto-imports"><span class="devsite-nav-text" tooltip="">Step 1: Enable auto imports</span></a></li><li class="devsite-nav-item"><a href="#step-2:-show-a-toast" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="50" track-type="navigation" track-name="rightNav" track-metadata-position="50" track-metadata-link-destination="#step-2:-show-a-toast"><span class="devsite-nav-text" tooltip="">Step 2: Show a toast</span></a></li><li class="devsite-nav-item"><a href="#step-3:-make-the-count-button-update-the-number-on-the-screen" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="51" track-type="navigation" track-name="rightNav" track-metadata-position="51" track-metadata-link-destination="#step-3:-make-the-count-button-update-the-number-on-the-screen"><span class="devsite-nav-text" tooltip="">Step 3: Make the Count button update the number on the screen</span></a></li><li class="devsite-nav-item"><a href="#step-4:-cache-the-textview-for-repeated-use" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="52" track-type="navigation" track-name="rightNav" track-metadata-position="52" track-metadata-link-destination="#step-4:-cache-the-textview-for-repeated-use"><span class="devsite-nav-text" tooltip="">Step 4: Cache the TextView for repeated use</span></a></li><li class="devsite-nav-item"><a href="#8" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="53" track-type="navigation" track-name="rightNav" track-metadata-position="53" track-metadata-link-destination="#8"><span class="devsite-nav-text" tooltip="">Task: Implement the second fragment</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_6" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="54" track-type="navigation" track-name="rightNav" track-metadata-position="54" track-metadata-link-destination="#what-youll-learn_6"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#update-the-layout-for-the-second-fragment" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="55" track-type="navigation" track-name="rightNav" track-metadata-position="55" track-metadata-link-destination="#update-the-layout-for-the-second-fragment"><span class="devsite-nav-text" tooltip="">Update the layout for the second fragment</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-a-textview-for-the-random-number" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="56" track-type="navigation" track-name="rightNav" track-metadata-position="56" track-metadata-link-destination="#step-1:-add-a-textview-for-the-random-number"><span class="devsite-nav-text" tooltip="">Step 1: Add a TextView for the random number</span></a></li><li class="devsite-nav-item"><a href="#step-2:-update-the-textview-to-display-the-header" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="57" track-type="navigation" track-name="rightNav" track-metadata-position="57" track-metadata-link-destination="#step-2:-update-the-textview-to-display-the-header"><span class="devsite-nav-text" tooltip="">Step 2: Update the TextView to display the header</span></a></li><li class="devsite-nav-item"><a href="#step-3:-change-the-background-color-of-the-layout" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="58" track-type="navigation" track-name="rightNav" track-metadata-position="58" track-metadata-link-destination="#step-3:-change-the-background-color-of-the-layout"><span class="devsite-nav-text" tooltip="">Step 3: Change the background color of the layout</span></a></li><li class="devsite-nav-item"><a href="#step-4:-examine-the-navigation-graph" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="59" track-type="navigation" track-name="rightNav" track-metadata-position="59" track-metadata-link-destination="#step-4:-examine-the-navigation-graph"><span class="devsite-nav-text" tooltip="">Step 4: Examine the navigation graph</span></a></li><li class="devsite-nav-item"><a href="#step-5:-enable-safeargs" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="60" track-type="navigation" track-name="rightNav" track-metadata-position="60" track-metadata-link-destination="#step-5:-enable-safeargs"><span class="devsite-nav-text" tooltip="">Step 5: Enable SafeArgs</span></a></li><li class="devsite-nav-item"><a href="#step-6:-create-the-argument-for-the-navigation-action" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="61" track-type="navigation" track-name="rightNav" track-metadata-position="61" track-metadata-link-destination="#step-6:-create-the-argument-for-the-navigation-action"><span class="devsite-nav-text" tooltip="">Step 6: Create the argument for the navigation action</span></a></li><li class="devsite-nav-item"><a href="#step-7:-send-the-count-to-the-second-fragment" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="62" track-type="navigation" track-name="rightNav" track-metadata-position="62" track-metadata-link-destination="#step-7:-send-the-count-to-the-second-fragment"><span class="devsite-nav-text" tooltip="">Step 7: Send the count to the second fragment</span></a></li><li class="devsite-nav-item"><a href="#step-8:-update-secondfragment-to-compute-and-display-a-random-number" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="63" track-type="navigation" track-name="rightNav" track-metadata-position="63" track-metadata-link-destination="#step-8:-update-secondfragment-to-compute-and-display-a-random-number"><span class="devsite-nav-text" tooltip="">Step 8: Update SecondFragment to compute and display a random number</span></a></li><li class="devsite-nav-item"><a href="#9" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="64" track-type="navigation" track-name="rightNav" track-metadata-position="64" track-metadata-link-destination="#9"><span class="devsite-nav-text" tooltip="">Learn more</span></a></li><li class="devsite-nav-item"><a href="#written-tutorials" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Right nav" data-value="65" track-type="navigation" track-name="rightNav" track-metadata-position="65" track-metadata-link-destination="#written-tutorials"><span class="devsite-nav-text" tooltip="">Written tutorials</span></a></li></ul></devsite-toc>
                <devsite-recommendations-sidebar class="nocontent devsite-nav">
                </devsite-recommendations-sidebar>
            </div>
          </div>
          
          <devsite-content>
            
              











<article class="devsite-article" has-bookmark=""><style>
      body {
        transition: opacity ease-in 0.2s;
      }

      body[unresolved] {
        opacity: 0;
        display: block;
        overflow: hidden;
        position: relative;
      }
      </style>
  
  
  
  
  

  <div class="devsite-article-meta nocontent" role="navigation">
    
    
    <ul class="devsite-breadcrumb-list">
  
</ul>
    
  </div>
  
      <h1 class="devsite-page-title" tabindex="-1">Build Your First Android App in Java</h1>
  <devsite-feature-tooltip ack-key="AckCollectionsBookmarkTooltipDismiss" analytics-category="Site-Wide Custom Events" analytics-action-show="Callout Profile displayed" analytics-action-close="Callout Profile dismissed" analytics-label="Create Collection Callout" class="devsite-page-bookmark-tooltip nocontent inline-block" dismiss-button="true" id="devsite-collections-dropdown" dismiss-button-text="Dismiss" close-button-text="Got it" ready="" current-step="0" style="--devsite-popout-offset-x: 32px;">

        
        <devsite-bookmark class="show"><devsite-dropdown-list ellipsis="" checkboxes="" fetchingitems="true" writable="" additemtext="New Collection" ready="" style="--devsite-popout-offset-x: 0px;"><span data-label="devsite-bookmark-direct-action" data-title="Save page" class="material-icons bookmark-icon bookmark-action" slot="toggle">bookmark_border</span><span data-label="devsite-bookmark-direct-action" data-title="Unsave page" hidden="" class="material-icons bookmark-icon unbookmark-action toggled" slot="toggle">bookmark</span></devsite-dropdown-list></devsite-bookmark>

        <span slot="popout-heading">
          
          Stay organized with collections
        </span>
        <span slot="popout-contents">
          
          Save and categorize content based on your preferences.
        </span>
      </devsite-feature-tooltip>
  

  <devsite-toc class="devsite-nav devsite-toc-embedded" depth="1" devsite-toc-embedded="" expandable="" visible=""><ul class="devsite-nav-list"><li class="devsite-nav-item devsite-nav-heading devsite-toc-toggle"><span class="devsite-nav-title" role="heading" aria-level="2"><span class="devsite-nav-text">On this page</span></span><button type="button" title="Expand/collapse contents" class="devsite-nav-show-all button-transparent material-icons"></button></li><li class="devsite-nav-item" visible=""><a href="#0" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="0" track-type="navigation" track-name="embeddedNav" track-metadata-position="0" track-metadata-link-destination="#0"><span class="devsite-nav-text" tooltip="">Welcome!</span></a></li><li class="devsite-nav-item" visible=""><a href="#what-you-must-know-already" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="1" track-type="navigation" track-name="embeddedNav" track-metadata-position="1" track-metadata-link-destination="#what-you-must-know-already"><span class="devsite-nav-text" tooltip="">What you must know already</span></a></li><li class="devsite-nav-item" visible=""><a href="#what-youll-learn" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="2" track-type="navigation" track-name="embeddedNav" track-metadata-position="2" track-metadata-link-destination="#what-youll-learn"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item" visible=""><a href="#use-android-studio-and-java-to-write-android-apps" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="3" track-type="navigation" track-name="embeddedNav" track-metadata-position="3" track-metadata-link-destination="#use-android-studio-and-java-to-write-android-apps"><span class="devsite-nav-text" tooltip="">Use Android Studio and Java to write Android apps</span></a></li><li class="devsite-nav-item" visible=""><a href="#1" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="4" track-type="navigation" track-name="embeddedNav" track-metadata-position="4" track-metadata-link-destination="#1"><span class="devsite-nav-text" tooltip="">Install Android Studio</span></a></li><li class="devsite-nav-item"><a href="#2" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="5" track-type="navigation" track-name="embeddedNav" track-metadata-position="5" track-metadata-link-destination="#2"><span class="devsite-nav-text" tooltip="">Task: Create your first project</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_1" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="6" track-type="navigation" track-name="embeddedNav" track-metadata-position="6" track-metadata-link-destination="#what-youll-learn_1"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-create-a-new-project" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="7" track-type="navigation" track-name="embeddedNav" track-metadata-position="7" track-metadata-link-destination="#step-1:-create-a-new-project"><span class="devsite-nav-text" tooltip="">Step 1: Create a new project</span></a></li><li class="devsite-nav-item"><a href="#step-2:-get-your-screen-set-up" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="8" track-type="navigation" track-name="embeddedNav" track-metadata-position="8" track-metadata-link-destination="#step-2:-get-your-screen-set-up"><span class="devsite-nav-text" tooltip="">Step 2: Get your screen set up</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-the-project-structure-and-layout" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="9" track-type="navigation" track-name="embeddedNav" track-metadata-position="9" track-metadata-link-destination="#step-3:-explore-the-project-structure-and-layout"><span class="devsite-nav-text" tooltip="">Step 3: Explore the project structure and layout</span></a></li><li class="devsite-nav-item"><a href="#step-4:-create-a-virtual-device-emulator" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="10" track-type="navigation" track-name="embeddedNav" track-metadata-position="10" track-metadata-link-destination="#step-4:-create-a-virtual-device-emulator"><span class="devsite-nav-text" tooltip="">Step 4: Create a virtual device (emulator)</span></a></li><li class="devsite-nav-item"><a href="#step-5:-run-your-app-on-your-new-emulator" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="11" track-type="navigation" track-name="embeddedNav" track-metadata-position="11" track-metadata-link-destination="#step-5:-run-your-app-on-your-new-emulator"><span class="devsite-nav-text" tooltip="">Step 5: Run your app on your new emulator</span></a></li><li class="devsite-nav-item"><a href="#step-6:-run-your-app-on-a-device-if-you-have-one" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="12" track-type="navigation" track-name="embeddedNav" track-metadata-position="12" track-metadata-link-destination="#step-6:-run-your-app-on-a-device-if-you-have-one"><span class="devsite-nav-text" tooltip="">Step 6: Run your app on a device (if you have one)</span></a></li><li class="devsite-nav-item"><a href="#troubleshooting" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="13" track-type="navigation" track-name="embeddedNav" track-metadata-position="13" track-metadata-link-destination="#troubleshooting"><span class="devsite-nav-text" tooltip="">Troubleshooting</span></a></li><li class="devsite-nav-item"><a href="#step-7:-explore-the-app-template" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="14" track-type="navigation" track-name="embeddedNav" track-metadata-position="14" track-metadata-link-destination="#step-7:-explore-the-app-template"><span class="devsite-nav-text" tooltip="">Step 7: Explore the app template</span></a></li><li class="devsite-nav-item"><a href="#3" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="15" track-type="navigation" track-name="embeddedNav" track-metadata-position="15" track-metadata-link-destination="#3"><span class="devsite-nav-text" tooltip="">Task: Explore the layout editor</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_2" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="16" track-type="navigation" track-name="embeddedNav" track-metadata-position="16" track-metadata-link-destination="#what-youll-learn_2"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-open-the-layout-editor" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="17" track-type="navigation" track-name="embeddedNav" track-metadata-position="17" track-metadata-link-destination="#step-1:-open-the-layout-editor"><span class="devsite-nav-text" tooltip="">Step 1: Open the layout editor</span></a></li><li class="devsite-nav-item"><a href="#step-2:-explore-and-resize-the-component-tree" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="18" track-type="navigation" track-name="embeddedNav" track-metadata-position="18" track-metadata-link-destination="#step-2:-explore-and-resize-the-component-tree"><span class="devsite-nav-text" tooltip="">Step 2: Explore and resize the Component Tree</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-view-hierarchies" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="19" track-type="navigation" track-name="embeddedNav" track-metadata-position="19" track-metadata-link-destination="#step-3:-explore-view-hierarchies"><span class="devsite-nav-text" tooltip="">Step 3: Explore view hierarchies</span></a></li><li class="devsite-nav-item"><a href="#step-4:-change-property-values" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="20" track-type="navigation" track-name="embeddedNav" track-metadata-position="20" track-metadata-link-destination="#step-4:-change-property-values"><span class="devsite-nav-text" tooltip="">Step 4: Change property values</span></a></li><li class="devsite-nav-item"><a href="#step-5:-change-text-display-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="21" track-type="navigation" track-name="embeddedNav" track-metadata-position="21" track-metadata-link-destination="#step-5:-change-text-display-properties"><span class="devsite-nav-text" tooltip="">Step 5: Change text display properties</span></a></li><li class="devsite-nav-item"><a href="#step-6:-display-all-attributes" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="22" track-type="navigation" track-name="embeddedNav" track-metadata-position="22" track-metadata-link-destination="#step-6:-display-all-attributes"><span class="devsite-nav-text" tooltip="">Step 6: Display all attributes</span></a></li><li class="devsite-nav-item"><a href="#4" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="23" track-type="navigation" track-name="embeddedNav" track-metadata-position="23" track-metadata-link-destination="#4"><span class="devsite-nav-text" tooltip="">Task: Add color resources</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_3" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="24" track-type="navigation" track-name="embeddedNav" track-metadata-position="24" track-metadata-link-destination="#what-youll-learn_3"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-color-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="25" track-type="navigation" track-name="embeddedNav" track-metadata-position="25" track-metadata-link-destination="#step-1:-add-color-resources"><span class="devsite-nav-text" tooltip="">Step 1: Add color resources</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-a-new-color-to-use-as-the-screen-background-color" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="26" track-type="navigation" track-name="embeddedNav" track-metadata-position="26" track-metadata-link-destination="#step-2:-add-a-new-color-to-use-as-the-screen-background-color"><span class="devsite-nav-text" tooltip="">Step 2: Add a new color to use as the screen background color</span></a></li><li class="devsite-nav-item"><a href="#step-3:-explore-width-and-height-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="27" track-type="navigation" track-name="embeddedNav" track-metadata-position="27" track-metadata-link-destination="#step-3:-explore-width-and-height-properties"><span class="devsite-nav-text" tooltip="">Step 3: Explore width and height properties</span></a></li><li class="devsite-nav-item"><a href="#5" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="28" track-type="navigation" track-name="embeddedNav" track-metadata-position="28" track-metadata-link-destination="#5"><span class="devsite-nav-text" tooltip="">Task: Add views and constraints</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_4" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="29" track-type="navigation" track-name="embeddedNav" track-metadata-position="29" track-metadata-link-destination="#what-youll-learn_4"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-view-constraint-properties" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="30" track-type="navigation" track-name="embeddedNav" track-metadata-position="30" track-metadata-link-destination="#step-1:-view-constraint-properties"><span class="devsite-nav-text" tooltip="">Step 1: View constraint properties</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-buttons-and-constrain-their-positions" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="31" track-type="navigation" track-name="embeddedNav" track-metadata-position="31" track-metadata-link-destination="#step-2:-add-buttons-and-constrain-their-positions"><span class="devsite-nav-text" tooltip="">Step 2: Add buttons and constrain their positions</span></a></li><li class="devsite-nav-item"><a href="#step-3:-add-a-constraint-to-the-new-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="32" track-type="navigation" track-name="embeddedNav" track-metadata-position="32" track-metadata-link-destination="#step-3:-add-a-constraint-to-the-new-button"><span class="devsite-nav-text" tooltip="">Step 3: Add a constraint to the new button</span></a></li><li class="devsite-nav-item"><a href="#step-4:-adjust-the-next-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="33" track-type="navigation" track-name="embeddedNav" track-metadata-position="33" track-metadata-link-destination="#step-4:-adjust-the-next-button"><span class="devsite-nav-text" tooltip="">Step 4: Adjust the Next button</span></a></li><li class="devsite-nav-item"><a href="#step-5:-delete-the-chain-constraints" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="34" track-type="navigation" track-name="embeddedNav" track-metadata-position="34" track-metadata-link-destination="#step-5:-delete-the-chain-constraints"><span class="devsite-nav-text" tooltip="">Step 5: Delete the chain constraints</span></a></li><li class="devsite-nav-item"><a href="#step-6:-add-new-constraints" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="35" track-type="navigation" track-name="embeddedNav" track-metadata-position="35" track-metadata-link-destination="#step-6:-add-new-constraints"><span class="devsite-nav-text" tooltip="">Step 6: Add new constraints</span></a></li><li class="devsite-nav-item"><a href="#step-7:-extract-string-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="36" track-type="navigation" track-name="embeddedNav" track-metadata-position="36" track-metadata-link-destination="#step-7:-extract-string-resources"><span class="devsite-nav-text" tooltip="">Step 7: Extract string resources</span></a></li><li class="devsite-nav-item"><a href="#step-8:-update-the-next-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="37" track-type="navigation" track-name="embeddedNav" track-metadata-position="37" track-metadata-link-destination="#step-8:-update-the-next-button"><span class="devsite-nav-text" tooltip="">Step 8: Update the Next button</span></a></li><li class="devsite-nav-item"><a href="#step-9:-add-a-third-button" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="38" track-type="navigation" track-name="embeddedNav" track-metadata-position="38" track-metadata-link-destination="#step-9:-add-a-third-button"><span class="devsite-nav-text" tooltip="">Step 9: Add a third button</span></a></li><li class="devsite-nav-item"><a href="#step-10:-get-your-ui-ready-for-the-next-task" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="39" track-type="navigation" track-name="embeddedNav" track-metadata-position="39" track-metadata-link-destination="#step-10:-get-your-ui-ready-for-the-next-task"><span class="devsite-nav-text" tooltip="">Step 10: Get your UI ready for the next task</span></a></li><li class="devsite-nav-item"><a href="#step-11:-fix-errors-if-necessary" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="40" track-type="navigation" track-name="embeddedNav" track-metadata-position="40" track-metadata-link-destination="#step-11:-fix-errors-if-necessary"><span class="devsite-nav-text" tooltip="">Step 11: Fix errors if necessary</span></a></li><li class="devsite-nav-item"><a href="#6" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="41" track-type="navigation" track-name="embeddedNav" track-metadata-position="41" track-metadata-link-destination="#6"><span class="devsite-nav-text" tooltip="">Task: Update the appearance of the buttons and the TextView</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-new-color-resources" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="42" track-type="navigation" track-name="embeddedNav" track-metadata-position="42" track-metadata-link-destination="#step-1:-add-new-color-resources"><span class="devsite-nav-text" tooltip="">Step 1: Add new color resources</span></a></li><li class="devsite-nav-item"><a href="#step-2:-add-a-background-color-for-the-buttons" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="43" track-type="navigation" track-name="embeddedNav" track-metadata-position="43" track-metadata-link-destination="#step-2:-add-a-background-color-for-the-buttons"><span class="devsite-nav-text" tooltip="">Step 2: Add a background color for the buttons</span></a></li><li class="devsite-nav-item"><a href="#step-3:-change-the-margins-of-the-left-and-right-buttons" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="44" track-type="navigation" track-name="embeddedNav" track-metadata-position="44" track-metadata-link-destination="#step-3:-change-the-margins-of-the-left-and-right-buttons"><span class="devsite-nav-text" tooltip="">Step 3: Change the margins of the left and right buttons</span></a></li><li class="devsite-nav-item"><a href="#step-4:-update-the-appearance-of-the-textview" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="45" track-type="navigation" track-name="embeddedNav" track-metadata-position="45" track-metadata-link-destination="#step-4:-update-the-appearance-of-the-textview"><span class="devsite-nav-text" tooltip="">Step 4: Update the appearance of the TextView</span></a></li><li class="devsite-nav-item"><a href="#step-5:-run-your-app" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="46" track-type="navigation" track-name="embeddedNav" track-metadata-position="46" track-metadata-link-destination="#step-5:-run-your-app"><span class="devsite-nav-text" tooltip="">Step 5: Run your app</span></a></li><li class="devsite-nav-item"><a href="#7" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="47" track-type="navigation" track-name="embeddedNav" track-metadata-position="47" track-metadata-link-destination="#7"><span class="devsite-nav-text" tooltip="">Task: Make your app interactive</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_5" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="48" track-type="navigation" track-name="embeddedNav" track-metadata-position="48" track-metadata-link-destination="#what-youll-learn_5"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#step-1:-enable-auto-imports" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="49" track-type="navigation" track-name="embeddedNav" track-metadata-position="49" track-metadata-link-destination="#step-1:-enable-auto-imports"><span class="devsite-nav-text" tooltip="">Step 1: Enable auto imports</span></a></li><li class="devsite-nav-item"><a href="#step-2:-show-a-toast" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="50" track-type="navigation" track-name="embeddedNav" track-metadata-position="50" track-metadata-link-destination="#step-2:-show-a-toast"><span class="devsite-nav-text" tooltip="">Step 2: Show a toast</span></a></li><li class="devsite-nav-item"><a href="#step-3:-make-the-count-button-update-the-number-on-the-screen" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="51" track-type="navigation" track-name="embeddedNav" track-metadata-position="51" track-metadata-link-destination="#step-3:-make-the-count-button-update-the-number-on-the-screen"><span class="devsite-nav-text" tooltip="">Step 3: Make the Count button update the number on the screen</span></a></li><li class="devsite-nav-item"><a href="#step-4:-cache-the-textview-for-repeated-use" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="52" track-type="navigation" track-name="embeddedNav" track-metadata-position="52" track-metadata-link-destination="#step-4:-cache-the-textview-for-repeated-use"><span class="devsite-nav-text" tooltip="">Step 4: Cache the TextView for repeated use</span></a></li><li class="devsite-nav-item"><a href="#8" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="53" track-type="navigation" track-name="embeddedNav" track-metadata-position="53" track-metadata-link-destination="#8"><span class="devsite-nav-text" tooltip="">Task: Implement the second fragment</span></a></li><li class="devsite-nav-item"><a href="#what-youll-learn_6" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="54" track-type="navigation" track-name="embeddedNav" track-metadata-position="54" track-metadata-link-destination="#what-youll-learn_6"><span class="devsite-nav-text" tooltip="">What you'll learn</span></a></li><li class="devsite-nav-item"><a href="#update-the-layout-for-the-second-fragment" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="55" track-type="navigation" track-name="embeddedNav" track-metadata-position="55" track-metadata-link-destination="#update-the-layout-for-the-second-fragment"><span class="devsite-nav-text" tooltip="">Update the layout for the second fragment</span></a></li><li class="devsite-nav-item"><a href="#step-1:-add-a-textview-for-the-random-number" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="56" track-type="navigation" track-name="embeddedNav" track-metadata-position="56" track-metadata-link-destination="#step-1:-add-a-textview-for-the-random-number"><span class="devsite-nav-text" tooltip="">Step 1: Add a TextView for the random number</span></a></li><li class="devsite-nav-item"><a href="#step-2:-update-the-textview-to-display-the-header" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="57" track-type="navigation" track-name="embeddedNav" track-metadata-position="57" track-metadata-link-destination="#step-2:-update-the-textview-to-display-the-header"><span class="devsite-nav-text" tooltip="">Step 2: Update the TextView to display the header</span></a></li><li class="devsite-nav-item"><a href="#step-3:-change-the-background-color-of-the-layout" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="58" track-type="navigation" track-name="embeddedNav" track-metadata-position="58" track-metadata-link-destination="#step-3:-change-the-background-color-of-the-layout"><span class="devsite-nav-text" tooltip="">Step 3: Change the background color of the layout</span></a></li><li class="devsite-nav-item"><a href="#step-4:-examine-the-navigation-graph" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="59" track-type="navigation" track-name="embeddedNav" track-metadata-position="59" track-metadata-link-destination="#step-4:-examine-the-navigation-graph"><span class="devsite-nav-text" tooltip="">Step 4: Examine the navigation graph</span></a></li><li class="devsite-nav-item"><a href="#step-5:-enable-safeargs" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="60" track-type="navigation" track-name="embeddedNav" track-metadata-position="60" track-metadata-link-destination="#step-5:-enable-safeargs"><span class="devsite-nav-text" tooltip="">Step 5: Enable SafeArgs</span></a></li><li class="devsite-nav-item"><a href="#step-6:-create-the-argument-for-the-navigation-action" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="61" track-type="navigation" track-name="embeddedNav" track-metadata-position="61" track-metadata-link-destination="#step-6:-create-the-argument-for-the-navigation-action"><span class="devsite-nav-text" tooltip="">Step 6: Create the argument for the navigation action</span></a></li><li class="devsite-nav-item"><a href="#step-7:-send-the-count-to-the-second-fragment" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="62" track-type="navigation" track-name="embeddedNav" track-metadata-position="62" track-metadata-link-destination="#step-7:-send-the-count-to-the-second-fragment"><span class="devsite-nav-text" tooltip="">Step 7: Send the count to the second fragment</span></a></li><li class="devsite-nav-item"><a href="#step-8:-update-secondfragment-to-compute-and-display-a-random-number" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="63" track-type="navigation" track-name="embeddedNav" track-metadata-position="63" track-metadata-link-destination="#step-8:-update-secondfragment-to-compute-and-display-a-random-number"><span class="devsite-nav-text" tooltip="">Step 8: Update SecondFragment to compute and display a random number</span></a></li><li class="devsite-nav-item"><a href="#9" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="64" track-type="navigation" track-name="embeddedNav" track-metadata-position="64" track-metadata-link-destination="#9"><span class="devsite-nav-text" tooltip="">Learn more</span></a></li><li class="devsite-nav-item"><a href="#written-tutorials" class="devsite-nav-title gc-analytics-event" data-category="Site-Wide Custom Events" data-action="click" data-label="Embedded nav" data-value="65" track-type="navigation" track-name="embeddedNav" track-metadata-position="65" track-metadata-link-destination="#written-tutorials"><span class="devsite-nav-text" tooltip="">Written tutorials</span></a></li><li class="devsite-toc-toggle"><button type="button" class="button-flat devsite-nav-more-items material-icons" track-type="navigation" track-name="embeddedNavExpand" title="Expand/collapse contents"></button></li></ul></devsite-toc>
  
    
  

  






<div class="devsite-article-body clearfix
  ">

  
    
    <google-codelab-analytics gaid="UA-49880327-14" ga4id="G-JTFZSJVVVZ" codelab-id="build-your-first-android-app" environment="web" category=""></google-codelab-analytics>
    <google-codelab codelab-gaid="" codelab-ga4id="" doc-id="" id="build-your-first-android-app" no-tooltip="" environment="web" category="" feedback-link="https://github.com/google-developer-training/first-android-app/issues/new?assignees=&amp;labels=&amp;template=first-android-app—java.md&amp;title=First+Android+App+codelab%3A+" layout="paginated" anayltics-ready="anayltics-ready" selected="8" google-codelab-ready="" codelab-title="Build Your First Android App in Java" google-codelab-completed=""><div id="codelab-title"><div id="codelab-nav-buttons"><a href="/" id="arrow-back" class="no-return-url"><i class="material-icons">close</i></a><a href="#" id="menu"><i class="material-icons">menu</i></a></div><h1 is-upgraded="" class="title"><a href="https://developer.android.com/codelabs/build-your-first-android-app">Build Your First Android App in Java</a></h1><div class="codelab-time-container" style="display: none;"></div><devsite-language-selector aria-label="Select your language preference.">
  <ul role="presentation">
    
    
    <li role="presentation">
      <a role="menuitem" lang="en" aria-current="true" href="https://developer.android.com/codelabs/build-your-first-android-app#5">English</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="es-419" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=es-419#5">Español – América Latina</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="id" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=id#5">Indonesia</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="pt-br" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=pt-br#5">Português – Brasil</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="zh-cn" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=zh-cn#5">中文 – 简体</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ja" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ja#5">日本語</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ko" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ko#5">한국어</a>
    </li>
    
  </ul>
</devsite-language-selector><devsite-user signed-in="" enable-profiles="" sign-in-url="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account" sign-out-url="https://developer.android.com/_d/signout?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235" url="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account"><div class="ogb-wrapper ogb-si"><div class="devsite-devprofile-wrapper show"><devsite-feature-tooltip ack-key="AckViewSavedPagesPopoutDismiss" id="devsite-view-saved-pages" close-button-href="" close-button-text="View" dismiss-button="" managed="" ready="" current-step="0" style="--devsite-popout-offset-x: 32px;"><button class="devsite-devprofile-button" aria-controls="devsite-devprofile-popout" aria-expanded="false" aria-haspopup="true" aria-label="Open Google Developer Profile" data-tooltip="Google Developer Profile"><svg width="4" height="16" viewBox="0 0 4 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M2 4C3.1 4 4 3.1 4 2C4 0.9 3.1 0 2 0C0.9 0 0 0.9 0 2C0 3.1 0.9 4 2 4ZM2 6C0.9 6 0 6.9 0 8C0 9.1 0.9 10 2 10C3.1 10 4 9.1 4 8C4 6.9 3.1 6 2 6ZM0 14C0 12.9 0.9 12 2 12C3.1 12 4 12.9 4 14C4 15.1 3.1 16 2 16C0.9 16 0 15.1 0 14Z" fill="#5F6368"></path></svg></button><span slot="popout-heading">Google Developer Profile</span><span slot="popout-contents">View your saved pages and finish your Google Developer Profile setup here.</span></devsite-feature-tooltip><div id="devsite-devprofile-popout" class="devsite-devprofile-popout" role="menu" aria-label="Google Developer Profile"></div></div><div class="devsite-user-dialog-signin">
  <a href="#" class="devsite-user-dialog-toggle devsite-top-button" role="button" aria-label="Open account dialog">
  
    <span class="devsite-user-dialog-letter">J</span>
  
  </a>
</div>

<div class="devsite-user-dialog" role="dialog" aria-modal="true" aria-label="Account Information" aria-hidden="true">
  <button class="devsite-user-dialog-exit" aria-label="Close menu">
    <svg width="22" height="22" viewBox="1 1 22 22">
      <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41z">
      </path>
    </svg>
  </button>
  <div class="devsite-user-dialog-email">jcdamo@gmail.com</div>
  
  <div class="devsite-user-dialog-photo">
  
    <span class="devsite-user-dialog-letter">J</span>
  
  </div>
  <div class="devsite-user-dialog-details">
    
    <div class="devsite-user-dialog-name">
      
       Hi, Joette!</div>
    
    <a class="devsite-user-manage" href="https://myaccount.google.com/?utm_source=OGB&amp;amp;utm_medium=act" target="_blank" aria-label="Manage your Google Account (opens a new tab)">
      
      Manage your Google Account
    </a>
  </div>
  <div class="devsite-user-dialog-buttons">
    <a class="devsite-user-signin" href="https://developer.android.com/_d/signin?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235&amp;prompt=select_account" target="_top">
      <svg width="21" height="21" viewBox="0 0 24 24">
        <path d="M20 13h-7v7h-2v-7H4v-2h7V4h2v7h7v2z"></path>
      </svg>
      
      Switch account
    </a>

    <a class="devsite-user-signout" href="https://developer.android.com/_d/signout?continue=https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbuild-your-first-android-app%235" target="_top">
      <svg height="24" viewBox="0 0 24 24" width="24">
        <path d="M17 7l-1.41 1.41L18.17 11H8v2h10.17l-2.58 2.58L17 17l5-5zM4 5h8V3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8v-2H4V5z">
        </path><path d="M0 0h24v24H0z" fill="none"></path>
      </svg>
      
      Sign out
    </a>
  </div>

  <div class="devsite-user-dialog-footer">
    <div class="devsite-user-dialog-footer-link">
      <a href="https://myaccount.google.com/privacypolicy" target="_blank">
        
        Privacy Policy
      </a>
    </div>

    <div class="devsite-user-dialog-footer-link">
      <a href="https://myaccount.google.com/termsofservice" target="_blank">
        
        Terms of Service
      </a>
    </div>
  </div>
</div></div></devsite-user></div><nav id="drawer"><div class="codelab-time-container" style="display: none;"></div><div class="steps"><ol><li completed=""><a href="#0"><span class="step"><span>Welcome!</span></span></a></li><li completed=""><a href="#1"><span class="step"><span>Install Android Studio</span></span></a></li><li completed=""><a href="#2"><span class="step"><span>Task: Create your first project</span></span></a></li><li completed=""><a href="#3"><span class="step"><span>Task: Explore the layout editor</span></span></a></li><li completed=""><a href="#4"><span class="step"><span>Task: Add color resources</span></span></a></li><li completed=""><a href="#5"><span class="step"><span>Task: Add views and constraints</span></span></a></li><li completed=""><a href="#6"><span class="step"><span>Task: Update the appearance of the buttons and the TextView</span></span></a></li><li completed=""><a href="#7"><span class="step"><span>Task: Make your app interactive</span></span></a></li><li completed="" selected=""><a href="#8"><span class="step"><span>Task: Implement the second fragment</span></span></a></li><li><a href="#9"><span class="step"><span>Learn more</span></span></a></li></ol></div></nav><div id="main"><div id="steps"><google-codelab-step label="Welcome!" duration="0" step="0" tabindex="-1"><google-codelab-about codelab-title="Build Your First Android App in Java" authors="lmf" last-updated="2023-09-21T19:59:23Z"><div class="codelab-title"><div class="token">Build Your First Android App in Java</div></div><div class="about-card"><h2 class="title">About this codelab</h2><div class="last-updated"><i class="material-icons">subject</i>Last updated Sep 21, 2023</div><div class="authors"><i class="material-icons">account_circle</i>Written by lmf</div></div></google-codelab-about><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#0">1. Welcome!</a></h2>
          
            
          
          
          <p class="image-container"><img alt="6cba94311109e72f.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/6cba94311109e72f.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>In this codelab, you'll learn how to build and run your first Android app in the Java programming language. (If you're looking for the  <a href="https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin" target="_blank">Kotlin version of this codelab</a>, you can go  <a href="https://codelabs.developers.google.com/codelabs/build-your-first-android-app/#0" target="_blank">here</a>.)</p>
<h2 is-upgraded="" id="what-you-must-know-already" data-text="What you must know already" tabindex="-1"><strong>What you must know already</strong></h2>
<p>This codelab is written for programmers and assumes that you know either the Java or Kotlin programming language. If you are an experienced programmer and adept at reading code, you will likely be able to follow this codelab, even if you don't have much experience with Java.</p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to use Android Studio to build your app.</li>
<li>How to run your app on a device or in the emulator.</li>
<li>How to add interactive buttons.</li>
<li>How to display a second screen when a button is pressed.</li>
</ul>
<h2 is-upgraded="" id="use-android-studio-and-java-to-write-android-apps" data-text="Use Android Studio and Java to write Android apps" tabindex="-1"><strong>Use Android Studio and Java to write Android apps</strong></h2>
<p>You write Android apps in the Java programming language using an IDE called Android Studio. Based on JetBrains' IntelliJ IDEA software, Android Studio is an IDE designed specifically for Android development.</p>
<aside class="special"><h3 is-upgraded="" id="note:-this-version-of-the-codelab-requires-android-studio-3.6-or-higher." data-text="Note: This version of the codelab requires Android Studio 3.6 or higher." tabindex="-1"><strong>Note: This version of the codelab requires Android Studio 3.<wbr>6 or higher.<wbr></strong></h3>
</aside>
<p>To work through this codelab, you will need a computer that can run  <a href="https://developer.android.com/studio/preview/" target="_blank">Android Studio 3.6</a> or higher (or already has Android Studio 3.6 or higher installed).</p>


        </div></div></google-codelab-step><google-codelab-step label="Install Android Studio" duration="0" step="1" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#1">2. Install Android Studio</a></h2>
          
          
          <aside class="special"><h3 is-upgraded="" id="note:-this-version-of-the-codelab-requires-android-studio-3.6-or-higher._1" data-text="Note: This version of the codelab requires Android Studio 3.6 or higher." tabindex="-1"><strong>Note: This version of the codelab requires Android Studio 3.<wbr>6 or higher.<wbr></strong></h3>
</aside>
<p>You can download Android Studio 3.6 from the  <a href="https://developer.android.com/studio/" target="_blank">Android Studio</a> page.</p>
<p>Android Studio provides a complete IDE, including an advanced code editor and app templates. It also contains tools for development, debugging, testing, and performance that make it faster and easier to develop apps. You can use Android Studio to test your apps with a large range of preconfigured emulators, or on your own mobile device. You can also build production apps and publish apps on the Google Play store.</p>
<aside class="special"><p><strong>Note:</strong> Android Studio is continually being improved. For the latest information on system requirements and installation instructions, see the  <a href="https://developer.android.com/studio" target="_blank">Android Studio download page</a>.</p>
</aside>
<p>Android Studio is available for computers running Windows or Linux, and for Macs running macOS. The OpenJDK (Java Development Kit) is bundled with Android Studio.</p>
<p>The installation is similar for all platforms. Any differences are noted below.</p>
<ol type="1">
<li>Navigate to the  <a href="https://developer.android.com/studio/" target="_blank">Android Studio download page</a> and follow the instructions to download and  <a href="https://developer.android.com/studio/install.html" target="_blank">install Android Studio</a>.</li>
<li>Accept the default configurations for all steps, and ensure that all components are selected for installation.</li>
<li>After the install is complete, the setup wizard downloads and installs additional components, including the Android SDK. Be patient, because this process might take some time, depending on your internet speed.</li>
<li>When the installation completes, Android Studio starts, and you are ready to create your first project.</li>
</ol>
<aside class="warning"><p><strong>Troubleshooting:</strong> If you run into problems with your installation, see the  <a href="https://developer.android.com/studio/releases" target="_blank">Android Studio release notes</a> or  <a href="https://developer.android.com/studio/troubleshoot" target="_blank">Troubleshoot Android Studio</a>.</p>
</aside>


        </div></div></google-codelab-step><google-codelab-step label="Task: Create your first project" duration="0" step="2" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#2">3. Task: Create your first project</a></h2>
          
          
          <p>In this step,  you will create a new Android project for your first app.  This simple app displays the string "Hello World" on the screen of an Android virtual or physical device.</p>
<p>Here's what the finished app will look like:</p>
<p class="image-container"><img alt="72c7e6d2960f4faa.png" style="width: 251.50px" src="/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/72c7e6d2960f4faa_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_1" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to create a project in Android Studio.</li>
<li>How to create an emulated Android device.</li>
<li>How to run your app on the emulator.</li>
<li>How to run your app on your own physical device, if you have one.</li>
</ul>
<h2 is-upgraded="" id="step-1:-create-a-new-project" data-text="Step 1: Create a new project" tabindex="-1"><strong>Step 1: Create a new project</strong></h2>
<ol type="1">
<li>Open Android Studio.</li>
<li>In the <strong>Welcome to Android Studio</strong> dialog, click <strong>Start a new Android Studio project</strong>. <img alt="c7c8a5cc4c9029b.png" style="width: 433.50px" src="/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7c8a5cc4c9029b_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Select <strong>Basic Activity</strong> (not the default). Click <strong>Next</strong>. <img alt="73e63b490a2f4ae6.png" style="width: 436.50px" src="/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73e63b490a2f4ae6_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Give your application a name such as <strong>My First App</strong>.</li>
<li>Make sure the <strong>Language</strong> is set to <strong>Java</strong>. <img alt="3ffb3ca42472b4f6.png" style="width: 422.68px" src="/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3ffb3ca42472b4f6_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Leave the defaults for the other fields.</li>
<li>Click <strong>Finish</strong>.</li>
</ol>
<p>After these steps, Android Studio:</p>
<ul>
<li>Creates a folder for your Android Studio project called <strong>MyFirstApp</strong>. This is usually in a folder called <strong>AndroidStudioProjects</strong> below your home directory.</li>
<li>Builds your project (this may take a few moments). Android Studio uses  <a href="https://gradle.org/" target="_blank">Gradle</a> as its build system. You can follow the build progress at the bottom of the Android Studio window.</li>
<li>Opens the code editor showing your project.</li>
</ul>
<h2 is-upgraded="" id="step-2:-get-your-screen-set-up" data-text="Step 2: Get your screen set up" tabindex="-1"><strong>Step 2: Get your screen set up</strong></h2>
<p>When your project first opens in Android Studio, there may be a lot of windows and panes open. To make it easier to get to know Android Studio, here are some suggestions on how to customize the layout.</p>
<ol type="1">
<li>If there's a <strong>Gradle</strong> window open on the right side, click on the minimize button (<strong>—</strong>) in the upper right corner to hide it. <img alt="97a3da610c1eede7.png" style="width: 553.50px" src="/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/97a3da610c1eede7_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Depending on the size of your screen, consider resizing the pane on the left showing the project folders to take up less space.</li>
</ol>
<p>At this point, your screen should look a bit less cluttered, similar to the screenshot shown below.</p>
<p class="image-container"><img alt="70183da1f878e11a.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/70183da1f878e11a.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/70183da1f878e11a_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-3:-explore-the-project-structure-and-layout" data-text="Step 3: Explore the project structure and layout" tabindex="-1"><strong>Step 3: Explore the project structure and layout</strong></h2>
<p>The upper left of the Android Studio window should look similar to the following diagram: <img alt="ecabcf48b6f7b9a1.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ecabcf48b6f7b9a1_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>Based on you selecting the <strong>Basic Activity</strong> template for your project, Android Studio has set up a number of files for you. You can look at the hierarchy of the files for your app in multiple ways, one is in <strong>Project</strong> view. <strong>Project</strong> view shows your files and folders structured in a way that is convenient for working with an Android project. (This does not always match the file hierarchy! To see the file hierarchy, choose the <strong>Project files</strong> view by clicking <strong>(3)</strong>.)</p>
<ol type="1">
<li>Double-click the <strong>app (1)</strong> folder to expand the hierarchy of app files. (See (<strong>1)</strong> in the screenshot.)</li>
<li>If you click <strong>Project (2)</strong>, you can hide or show the <strong>Project</strong> view. You might need to select <strong>View &gt; Tool Windows</strong> to see this option.</li>
<li>The current <strong>Project</strong> view selection (3) is <strong>Project &gt; Android</strong>.</li>
</ol>
<p>In the <strong>Project &gt; Android</strong> view you see three or four top-level folders below your <strong>app</strong> folder: <strong>manifests</strong>, <strong>java</strong>, <strong>java (generated)</strong> and <strong>res</strong>. You may not see <strong>java (generated)</strong> right away.</p>
<ol type="1">
<li>Expand the <strong>manifests</strong> folder.</li>
</ol>
<p>This folder contains <code translate="no" dir="ltr">AndroidManifest.xml</code><strong>.</strong> This file describes all the components of your Android app and is read by the Android runtime system when your app is executed. 2. Expand the <strong>java</strong> folder. All your Java language files are organized here. The <strong>java</strong> folder contains three subfolders:</p>
<p><strong>com.example.myfirstapp:</strong> This folder contains the Java source code files for your app.</p>
<p><strong>com.example.myfirstapp (androidTest):</strong> This folder is where you would put your instrumented tests, which are tests that run on an Android device. It starts out with a skeleton test file.</p>
<p><strong>com.example.myfirstapp (test):</strong> This folder is where you would put your unit tests. Unit tests don't need an Android device to run. It starts out with a skeleton unit test file. 3. Expand the <strong>res</strong> folder. This folder contains all the resources for your app, including images, layout files, strings, icons, and styling. It includes these subfolders:</p>
<p><strong>drawable</strong>: All your app's images will be stored in this folder.</p>
<p><strong>layout</strong>: This folder contains the UI layout files for your activities. Currently, your app has one activity that has a layout file called <code translate="no" dir="ltr">activity_main.xml</code>. It also contains <code translate="no" dir="ltr">content_main.xml</code>, <code translate="no" dir="ltr">fragment_first.xml</code>, and <code translate="no" dir="ltr">fragment_second.xml</code>.</p>
<p><strong>menu:</strong> This folder contains XML files describing any menus in your app.</p>
<p><strong>mipmap</strong>: This folder contains the launcher icons for your app.</p>
<p><strong>navigation:</strong> This folder contains the navigation graph, which tells Android Studio how to navigate between different parts of your application.</p>
<p><strong>values</strong>: This folder contains resources, such as strings and colors, used in your app.</p>
<h2 is-upgraded="" id="step-4:-create-a-virtual-device-emulator" data-text="Step 4: Create a virtual device (emulator)" tabindex="-1"><strong>Step 4: Create a virtual device (emulator)</strong></h2>
<p>In this task, you will use the  <a href="http://developer.android.com/tools/devices/managing-avds.html" target="_blank">Android Virtual Device (AVD) manager</a> to create a virtual device (or emulator) that simulates the configuration for a particular type of Android device.</p>
<p>The first step is to create a configuration that describes the virtual device.</p>
<ol type="1">
<li>In Android Studio, select <strong>Tools</strong> &gt; <strong>AVD Manager</strong>, or click the AVD Manager icon in the toolbar.  <img alt="1ef215721ed1bd47.png" style="width: 48.00px" src="/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1ef215721ed1bd47_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Click <strong>+Create Virtual Device</strong>. (If you have created a virtual device before, the window shows all of your existing devices and the <strong>+Create Virtual Device</strong> button is at the bottom.) The <strong>Select Hardware</strong> window shows a list of pre-configured hardware device definitions.</li>
<li>Choose a device definition, such as <strong>Pixel 2</strong>, and click <strong>Next</strong>. (For this codelab, it really doesn't matter which device definition you pick).</li>
<li>In the <strong>System Image</strong> dialog, from the <strong>Recommended</strong> tab, choose the latest release. (This does matter.)</li>
<li>If a <strong>Download</strong> link is visible next to a latest release, it is not installed yet, and you need to download it first. If necessary, click the link to start the download, and click <strong>Next</strong> when it's done. This may take a while depending on your connection speed.</li>
</ol>
<aside class="special"><p><strong>Note:</strong> System images can take up a large amount of disk space, so just download what you need.</p>
</aside>
<ol type="1" start="6">
<li>In the next dialog box, accept the defaults, and click <strong>Finish</strong>.</li>
</ol>
<p>The AVD Manager now shows the virtual device you added.</p>
<ol type="1" start="7">
<li>If the <strong>Your Virtual Devices</strong> AVD Manager window is still open, go ahead and close it.</li>
</ol>
<h2 is-upgraded="" id="step-5:-run-your-app-on-your-new-emulator" data-text="Step 5: Run your app on your new emulator" tabindex="-1">Step 5: Run your app on your new emulator</h2>
<ol type="1">
<li>In Android Studio, select <strong>Run &gt; Run ‘app'</strong> or click the <strong>Run</strong> icon in the toolbar.   <img alt="609c3e4473493202.png" style="width: 24.00px" src="/static/codelabs/build-your-first-android-app/img/609c3e4473493202.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> The icon will change when your app is already running.  <img alt="edee73c1aed2b57e.png" style="width: 25.80px" src="/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/edee73c1aed2b57e_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<aside class="special"><p>If you get a dialog box stating "Instant Run requires that the platform corresponding to your target device (Android N...) is installed" go ahead and click <strong>Install and continue.</strong></p>
</aside>
<ol type="1" start="2">
<li>In <strong>Run &gt; Select Device</strong>, under <strong>Available devices</strong>, select the virtual device that you just configured. This menu also appears in the toolbar.</li>
</ol>
<p class="image-container"><img alt="b1215d5cf034b077.png" style="width: 256.00px" src="/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b1215d5cf034b077_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The emulator starts and boots just like a physical device. Depending on the speed of your computer, this may take a while. You can look in the small horizontal status bar at the very bottom of Android Studio for messages to see the progress.</p>
<div class="devsite-table-wrapper"><table class="vertical-rules">
<tbody><tr><td colspan="2" rowspan="1"><p><strong>Messages that might appear briefly in the status bar</strong></p>
</td><td colspan="1" rowspan="1"></td></tr>
<tr><td colspan="1" rowspan="1"><p><em>Gradle build running</em></p>
</td><td colspan="1" rowspan="1"><p class="image-container"><img src="/static/codelabs/build-your-first-android-app/img/d0619795547e4c14.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d0619795547e4c14_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p><em>Waiting for target device to come on line</em></p>
</td><td colspan="1" rowspan="1"><p class="image-container"><img src="/static/codelabs/build-your-first-android-app/img/9f8985362a878fea.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9f8985362a878fea_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p><em>Installing APK</em></p>
</td><td colspan="1" rowspan="1"><p class="image-container"><img src="/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/2126fe0fde82e5cb_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p><em>Launching activity</em></p>
</td><td colspan="1" rowspan="1"><p class="image-container"><img src="/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/da65b2c9371666d0_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
</td></tr>
</tbody></table></div>
<p>Once your app builds and the emulator is ready, Android Studio uploads the app to the emulator and runs it. You should see your app as shown in the following screenshot.</p>
<p class="image-container"><img alt="89960f5a856e1aa7.png" style="width: 257.50px" src="/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/89960f5a856e1aa7_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<aside class="special"><p><strong>Note</strong>: It is a good practice to start the emulator at the beginning of your session. Don't close the emulator until you are done testing your app, so that you don't have to wait for the emulator to boot again. Also, don't have more than one emulator running at once, to reduce memory usage.</p>
</aside>
<h2 is-upgraded="" id="step-6:-run-your-app-on-a-device-if-you-have-one" data-text="Step 6: Run your app on a device (if you have one)" tabindex="-1">Step 6: Run your app on a device (if you have one)</h2>
<p>What you need:</p>
<ul>
<li>An Android device such as a phone or tablet.</li>
<li>A data cable to connect your Android device to your computer via the USB port.</li>
<li>If you are using a Linux or Windows OS, you may need to perform additional steps to run your app on a hardware device. Check the  <a href="http://developer.android.com/tools/device.html" target="_blank">Run Apps on a Hardware Device</a> documentation. On Windows, you may need to install the appropriate USB driver for your device. See  <a href="http://developer.android.com/tools/extras/oem-usb.html" target="_blank">OEM USB Drivers</a>.</li>
</ul>
<h3 is-upgraded="" id="run-your-app-on-a-device" data-text="Run your app on a device" tabindex="-1"><strong>Run your app on a device</strong></h3>
<p>To let Android Studio communicate with your device, you must turn on USB Debugging on your Android device.</p>
<p>On Android 4.2 and higher, the Developer options screen is hidden by default.  To show Developer options and enable USB Debugging:</p>
<ol type="1">
<li>On your device, open <strong>Settings &gt; About phone</strong> and tap <strong>Build number</strong> seven times.</li>
<li>Return to the previous screen (<strong>Settings</strong>).  <strong>Developer options</strong> appears at the bottom of the list.  Tap <strong>Developer options</strong>.</li>
<li>Enable <strong>USB Debugging</strong>.</li>
</ol>
<p>Now you can connect your device and run the app from Android Studio.</p>
<ol type="1">
<li>Connect  your device to your development machine with a USB cable. On the device, you might need to agree to allow USB debugging from your development device.</li>
<li>In Android Studio, click <strong>Run  </strong><img alt="609c3e4473493202.png" style="width: 23.50px" src="/static/codelabs/build-your-first-android-app/img/609c3e4473493202.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/609c3e4473493202_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> in the toolbar at the top of the window. (You  might need to select <strong>View &gt; Toolbar</strong> to see this option.) The <strong>Select Deployment Target</strong> dialog opens with the list of available emulators and connected devices.</li>
<li>Select your device, and click <strong>OK</strong>. Android Studio installs the app on your device and runs it.</li>
</ol>
<aside class="special"><p><strong>Note</strong>: If your device is running an Android platform that isn't installed in Android Studio, you might see a message asking if you want to install the needed platform. Click <strong>Install and Continue</strong>, then click <strong>Finish</strong> when the process is complete.</p>
</aside>
<h2 is-upgraded="" id="troubleshooting" data-text="Troubleshooting" tabindex="-1"><strong>Troubleshooting</strong></h2>
<p>If you're stuck, quit Android Studio and restart it.</p>
<p>If Android Studio does not recognize your device, try the following:</p>
<ol type="1">
<li>Disconnect your device from your development machine and reconnect it.</li>
<li>Restart Android Studio.</li>
</ol>
<p>If your computer still does not find the device or declares it "unauthorized":</p>
<ol type="1">
<li>Disconnect the device.</li>
<li>On the device, open <strong>Settings-&gt;Developer Options</strong>.</li>
<li>Tap <strong>Revoke USB Debugging authorizations</strong>.</li>
<li>Reconnect the device to your computer.</li>
<li>When prompted, grant authorizations.</li>
</ol>
<p>If you are still having trouble, check that you installed the appropriate USB driver for your device. See the  <a href="http://developer.android.com/tools/device.html" target="_blank">Using Hardware Devices documentation</a>.</p>
<p>Check the  <a href="https://developer.android.com/studio/troubleshoot" target="_blank">troubleshooting section in the Android Studio documentation</a>.</p>
<h2 is-upgraded="" id="step-7:-explore-the-app-template" data-text="Step 7: Explore the app template" tabindex="-1"><strong>Step 7: Explore the app template</strong></h2>
<p>When you created the project and selected <strong>Basic Activity</strong>, Android Studio set up a number of files, folders, and also user interface elements for you, so you can start out with a working app and major components in place.  This makes it easier to build your application.</p>
<p>Looking at your app on the emulator or your device, in addition to the <strong>Next</strong> button, notice the  <a href="https://developer.android.com/guide/topics/ui/floating-action-button" target="_blank"><em>floating action button</em></a> with an email icon. <img alt="791b06443568c703.png" style="width: 37.14px" src="/static/codelabs/build-your-first-android-app/img/791b06443568c703.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/791b06443568c703_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> If you tap that button, you'll see it has been set up to briefly show a message at the bottom of the screen. This message space is called a  <a href="https://developer.android.com/reference/android/support/design/widget/Snackbar" target="_blank"><em>snackbar</em></a>, and it's one of several ways to notify users of your app with brief information.</p>
<p class="image-container"><img alt="24ebb1f42e1fb418.png" style="width: 289.89px" src="/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/24ebb1f42e1fb418_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>At the top right of the screen, there's a menu with 3 vertical dots.  <img alt="37010a0e7f96362c.png" style="width: 24.67px" src="/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37010a0e7f96362c_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> If you tap on that, you'll see that Android Studio has also created an options menu with a <strong>Settings</strong> item. Choosing <strong>Settings</strong> doesn't do anything yet, but having it set up for you makes it easier to add user-configurable settings to your app. <img alt="1fc9e57692132430.png" style="width: 289.50px" src="/static/codelabs/build-your-first-android-app/img/1fc9e57692132430.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1fc9e57692132430_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>Later in this codelab, you'll  look at the <strong>Next</strong> button and modify the way it looks and what it does.</p>


        </div></div></google-codelab-step><google-codelab-step label="Task: Explore the layout editor" duration="0" step="3" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#3">4. Task: Explore the layout editor</a></h2>
          
          
          <p>Generally, each screen in your Android app is associated with one or more  <a href="https://developer.android.com/guide/components/fragments" target="_blank"><em>fragments</em></a>. The single screen displaying "Hello first fragment" is created by one fragment, called <code translate="no" dir="ltr">FirstFragment</code>. This was generated for you when you created your new project. Each visible fragment in an Android app has a layout that defines the user interface for the fragment. Android Studio has a layout editor where you can create and define layouts.</p>
<p>Layouts are defined in  <a href="https://en.wikipedia.org/wiki/XML" target="_blank">XML</a>. The layout editor lets you define and modify your layout either by coding XML or by using the interactive visual editor.</p>
<p>Every element in a layout is a view. In this task, you will explore some of the panels in the layout editor, and you will learn how to change property of views.</p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_2" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to use the layout editor.</li>
<li>How to set property values.</li>
<li>How to add string resources.</li>
<li>How to add color resources.</li>
</ul>
<h2 is-upgraded="" id="step-1:-open-the-layout-editor" data-text="Step 1: Open the layout editor" tabindex="-1"><strong>Step 1: Open the layout editor</strong></h2>
<ol type="1">
<li>Find and open the <strong>layout</strong> folder (<strong>app &gt; res &gt; layout</strong>) on the left side in the <strong>Project</strong> panel. <img alt="bb7b4fe5af80859d.png" style="width: 271.00px" src="/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bb7b4fe5af80859d_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Double-click <code translate="no" dir="ltr">fragment_first.xml</code>.</li>
</ol>
<aside class="warning"><p><strong>Troubleshooting:</strong> If you don't see the file <code translate="no" dir="ltr">fragment_first.xml</code>, confirm you are running Android Studio 3.6 or later, which is required for this codelab.</p>
</aside>
<p>The panels to the right of the Project view comprise the <em>Layout Editor</em>. They may be arranged differently in your version of Android Studio, but the function is the same. <img alt="cb9d2ce821f0a8b.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/cb9d2ce821f0a8b_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>On the left is a <strong>Palette (1)</strong> of views you can add to your app.</p>
<p>Below that is a <strong>Component Tree (2)</strong> showing the views currently in this file, and how they are arranged in relation to each other.</p>
<p>In the center is the <em>Design editor </em><strong>(3)</strong><em>,</em> which shows a visual representation of what the contents of the file will look like when compiled into an Android app. You can view the visual representation, the XML code, or both.</p>
<ol type="1" start="3">
<li>In the upper right corner of the Design editor, above <strong>Attributes (4)</strong>, find the three icons that look like this: <img alt="c60f285cb7fbc306.png" style="width: 311.00px" src="/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c60f285cb7fbc306_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> These represent <strong>Code</strong> (code only), <strong>Split</strong> (code + design), and <strong>Design</strong> (design only) views.</li>
<li>Try selecting the different modes. Depending on your screen size and work style, you may prefer switching between <strong>Code</strong> and <strong>Design</strong>, or staying in <strong>Split</strong> view. If your <strong>Component Tree</strong> disappears, hide and show the <strong>Palette</strong>.</li>
</ol>
<p><strong>Split</strong> view: <img alt="32d3075ed7f5c02c.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/32d3075ed7f5c02c_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="5">
<li>At the lower right of the Design editor you see <strong>+</strong> and <strong>-</strong> buttons for zooming in and out. Use these buttons to adjust the size of what you see, or click the zoom-to-fit button so that both panels fit on your screen.</li>
</ol>
<p class="image-container"><img alt="a7d0a08766682f9.png" style="width: 47.00px" src="/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a7d0a08766682f9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The <em>Design layout</em> on the left shows how your app appears on the device. The <em>Blueprint layout</em>, shown on the right, is a schematic view of the layout.</p>
<ol type="1" start="6">
<li>Practice using  the layout menu in the top left of the design toolbar to display the design view, the blueprint view, and both views side by side. <img alt="6572c0c05460eafd.png" style="width: 211.80px" src="/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6572c0c05460eafd_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<p>Depending on the size of your screen and your preference, you may wish to only show the <strong>Design</strong> view or the <strong>Blueprint</strong> view, instead of both.</p>
<ol type="1" start="7">
<li>Use the orientation icon to change the orientation of the layout. This allows you to test how your layout will fit portrait and landscape modes. <img alt="c40138d924cedb8f.png" style="width: 271.11px" src="/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c40138d924cedb8f_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Use the device menu to view the layout on different devices. (This is extremely useful for testing!)</li>
</ol>
<p class="image-container"><img alt="46754977c9c3d6c9.png" style="width: 426.20px" src="/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/46754977c9c3d6c9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>On the right is the <strong>Attributes</strong> panel. You'll learn about that later.</p>
<h2 is-upgraded="" id="step-2:-explore-and-resize-the-component-tree" data-text="Step 2: Explore and resize the Component Tree" tabindex="-1"><strong>Step 2: Explore and resize the Component Tree</strong></h2>
<ol type="1">
<li>In <code translate="no" dir="ltr">fragment_first.xml</code>, look at the <strong>Component Tree</strong>. If it's not showing, switch the mode to <strong>Design</strong> instead of <strong>Split</strong> or <strong>Code</strong>.</li>
</ol>
<p class="image-container"><img alt="855789e5c4867c8f.png" style="width: 317.00px" src="/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/855789e5c4867c8f_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>This panel shows the <em>view hierarchy</em> in your layout, that is, how the views are arranged in relation to each other. 2. If necessary, resize the <strong>Component Tree</strong> so you can read at least part of the strings. 3. Click the <strong>Hide</strong> icon at the top right of the <strong>Component Tree</strong>.  <img alt="7b183024169396dd.png" style="width: 42.93px" src="/static/codelabs/build-your-first-android-app/img/7b183024169396dd.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7b183024169396dd_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The <strong>Component Tree</strong> closes. 4. Bring back the <strong>Component Tree</strong> by clicking the vertical label <strong>Component Tree</strong> on the left.</p>
<p class="image-container"><img alt="35c14a27fd2ce30a.png" style="width: 115.00px" src="/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/35c14a27fd2ce30a_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-3:-explore-view-hierarchies" data-text="Step 3: Explore view hierarchies" tabindex="-1"><strong>Step 3: Explore view hierarchies</strong></h2>
<ol type="1">
<li>In the <strong>Component Tree</strong>, notice that the root of the view hierarchy is a <code translate="no" dir="ltr">ConstraintLayout</code> view.</li>
</ol>
<p>Every layout must have a root view that contains all the other views. The root view is always a <em>view group</em>, which is a view that contains other views. A <code translate="no" dir="ltr">ConstraintLayout</code> is one example of a view group. 2. Notice that the <code translate="no" dir="ltr">ConstraintLayout</code> contains a <code translate="no" dir="ltr">TextView</code>, called <code translate="no" dir="ltr">textview_first</code> and a <code translate="no" dir="ltr">Button</code>, called <code translate="no" dir="ltr">button_first</code>.</p>
<p class="image-container"><img alt="506cf77387f00782.png" style="width: 316.00px" src="/static/codelabs/build-your-first-android-app/img/506cf77387f00782.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/506cf77387f00782_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="3">
<li>If the code isn't showing, switch to <strong>Code</strong> or <strong>Split</strong> view using the icons in the upper right corner.</li>
<li>In the XML code, notice that the root element is <code translate="no" dir="ltr">&lt;androidx.constraintlayout.widget.ConstraintLayout&gt;</code>. The root element contains a <code translate="no" dir="ltr">&lt;TextView&gt;</code> element and a <code translate="no" dir="ltr">&lt;Button&gt;</code> element.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;androidx.constraintlayout.widget.ConstraintLayout</span></span><span class="pln"><span class="pln"><br>&nbsp; ... </span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;TextView</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; ... &nbsp;</span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;Button</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; ... &nbsp;</span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br><br></span></span><span class="tag"><span class="tag">&lt;/androidx.constraintlayout.widget.ConstraintLayout&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-4:-change-property-values" data-text="Step 4: Change property values" tabindex="-1"><strong>Step 4: Change property values</strong></h2>
<ol type="1">
<li>In the code editor, examine the properties in the <code translate="no" dir="ltr">TextView</code> element.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;TextView</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"Hello first fragment"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;... </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>Click on the string in the <strong>text</strong> property, and you'll notice it refers to a string resource, <code translate="no" dir="ltr">hello_first_fragment</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">android</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">text</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@string/hello_first_fragment"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Right-click on the property and click <strong>Go To &gt; Declaration or Usages</strong></li>
</ol>
<p><code translate="no" dir="ltr">values/strings.xml</code> opens with the string highlighted.</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;string</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"hello_first_fragment"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">Hello first fragment</span></span><span class="tag"><span class="tag">&lt;/string&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Change the value of the <code translate="no" dir="ltr">string</code> property to <code translate="no" dir="ltr">Hello World!</code>.</li>
<li>Switch back to <code translate="no" dir="ltr">fragment_first.xml</code>.</li>
<li>Select <code translate="no" dir="ltr">textview_first</code> in the <strong>Component Tree</strong>. <img alt="19cfd9f54f58b379.png" style="width: 317.00px" src="/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/19cfd9f54f58b379_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Look at the <strong>Attributes</strong> panel on the right, and open the <strong>Declared Attributes</strong> section if needed. <img alt="549f087103c9acbe.png" style="width: 299.00px" src="/static/codelabs/build-your-first-android-app/img/549f087103c9acbe.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/549f087103c9acbe_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<aside class="special"><p><strong>Troubleshooting this step</strong>:</p>
<ul>
<li>If the <strong>Attributes</strong> panel is not visible, click the vertical <strong>Attributes</strong> label at the top right. <img alt="e6a2a689769c8afd.png" style="width: 61.26px" src="/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e6a2a689769c8afd_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ul>
</aside>
<ol type="1" start="9">
<li>In the <strong>text</strong> field of the <code translate="no" dir="ltr">TextView</code> in <strong>Attributes</strong>, notice it still refers to the string resource <code translate="no" dir="ltr">@string/hello_first_fragment</code>. Having the strings in a resource file has several advantages. You can change the value of string without having to change any other code. This simplifies translating your app to other languages, because your translators don't have to know anything about the app code. <img alt="8bb6bf0caffa82a4.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8bb6bf0caffa82a4_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<aside class="special"><p><strong>Tip:</strong> To find a property in the list of all the properties, click on the magnifying glass icon to the right of <strong>Attributes</strong>, and begin typing the name of the property. Android Studio will show just the properties that contain that string.</p>
<p class="image-container"><img alt="6349e6a522fda9ea.png" style="width: 323.90px" src="/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6349e6a522fda9ea_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p class="image-container"><img alt="1e116f4ea013be17.png" style="width: 326.39px" src="/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1e116f4ea013be17_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
</aside>
<ol type="1" start="10">
<li>Run the app to see the change you made in <strong>strings.xml</strong>. Your app now shows "Hello World!".</li>
</ol>
<p class="image-container"><img alt="d2103406630c3527.png" style="width: 238.50px" src="/static/codelabs/build-your-first-android-app/img/d2103406630c3527.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d2103406630c3527_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-5:-change-text-display-properties" data-text="Step 5: Change text display properties" tabindex="-1"><strong>Step 5: Change text display properties</strong></h2>
<ol type="1">
<li>With <code translate="no" dir="ltr">textview_first</code> still selected in the <strong>Component Tree</strong>, in the layout editor, in the list of attributes, under <strong>Common Attributes</strong>, expand the <strong>textAppearance</strong> field. (You may need to scroll down to find it.)</li>
</ol>
<p class="image-container"><img alt="37c72a9385dab52d.png" style="width: 342.00px" src="/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/37c72a9385dab52d_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="2">
<li>Change some of the text appearance properties. For example, change the font family, increase the text size, and select bold style. (You might need to scroll the panel to see all the fields.)</li>
<li>Change the text color. Click in the <strong>textColor</strong> field, and enter <code translate="no" dir="ltr">g</code>.</li>
</ol>
<p>A menu pops up with possible completion values containing the letter g. This list includes predefined colors.</p>
<p class="image-container"><img alt="39597ff5cf9661da.png" style="width: 421.00px" src="/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/39597ff5cf9661da_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="4">
<li>Select <strong>@android:color/darker_gray</strong> and press <strong>Enter</strong>.</li>
</ol>
<p>Below is an example of the <strong>textAppearance</strong> attributes after making some changes.</p>
<p class="image-container"><img alt="8751426a21281f94.png" style="width: 298.98px" src="/static/codelabs/build-your-first-android-app/img/8751426a21281f94.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8751426a21281f94_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="5">
<li>Look at the XML for the <code translate="no" dir="ltr">TextView</code>. You see that the new properties have been added.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&lt;TextView<br>&nbsp; &nbsp;android:id="@+id/textview_first"<br>&nbsp; &nbsp;android:layout_width="wrap_content"<br>&nbsp; &nbsp;android:layout_height="wrap_content"<br>&nbsp; &nbsp;android:fontFamily="sans-serif-condensed"<br>&nbsp; &nbsp;android:text="@string/hello_first_fragment"<br>&nbsp; &nbsp;android:textColor="@android:color/darker_gray"<br>&nbsp; &nbsp;android:textSize="30sp"<br>&nbsp; &nbsp;android:textStyle="bold"<br></span></span></code></pre></devsite-code>
<ol type="1" start="6">
<li>Run your app again and see the changes applied to your Hello World! string</li>
</ol>
<p class="image-container"><img alt="c715d9230068d0f8.png" style="width: 238.70px" src="/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c715d9230068d0f8_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-6:-display-all-attributes" data-text="Step 6: Display all attributes" tabindex="-1"><strong>Step 6: Display all attributes</strong></h2>
<ol type="1">
<li>In the <strong>Attributes</strong> panel, scroll down until you find <strong>All Attributes</strong>.</li>
</ol>
<aside class="special"><p>If you don't see any attributes in the <strong>Attributes</strong> panel, make sure <code translate="no" dir="ltr">textview_first</code> is still selected in the <strong>Component Tree</strong>.</p>
</aside>
<p class="image-container"><img alt="6e28336e8d85fa14.png" style="width: 355.00px" src="/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6e28336e8d85fa14_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="2">
<li>Scroll through the list to get an idea of the attributes you could set for a <code translate="no" dir="ltr">TextView</code>.</li>
</ol>


        </div></div></google-codelab-step><google-codelab-step label="Task: Add color resources" duration="0" step="4" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#4">5. Task: Add color resources</a></h2>
          
          
          <p>So far you have learned how to change property values. Next, you will learn how to create more resources like the string resources you worked with earlier. Using resources enables you to use the same values in multiple places, or to define values and have the UI update automatically whenever the value is changed.</p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_3" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How resources are defined.</li>
<li>Adding and using color resources.</li>
<li>The results of changing layout height and width.</li>
</ul>
<h2 is-upgraded="" id="step-1:-add-color-resources" data-text="Step 1: Add color resources" tabindex="-1"><strong>Step 1: Add color resources</strong></h2>
<p>First, you'll learn how to add new color resources.</p>
<ol type="1">
<li>In the <strong>Project</strong> panel on the left, double-click on <strong>res</strong> &gt; <strong>values</strong> &gt; <strong>colors.xml</strong> to open the color resource file.</li>
</ol>
<p class="image-container"><img alt="8fa53d358e4a9813.png" style="width: 559.00px" src="/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa53d358e4a9813_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;resources&gt;</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"colorPrimary"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#6200EE</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"colorPrimaryDark"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#3700B3</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"colorAccent"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#03DAC5</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br></span></span><span class="tag"><span class="tag">&lt;/resources&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>The <code translate="no" dir="ltr">colors.xml</code> file opens in the editor. So far, three colors have been defined. These are the colors you can see in your app layout, for example, purple for the app bar.</p>
<aside class="special"><p><strong>Note:</strong> Different versions of Android Studio use different values for these colors, so you may see other colors here.</p>
</aside>
<ol type="1" start="2">
<li>Go back to <code translate="no" dir="ltr">fragment_first.xml</code> so you can see the XML code for the layout.</li>
<li>Add a new property to the <code translate="no" dir="ltr">TextView</code> called <code translate="no" dir="ltr">android:background</code>, and start typing to set its value to <code translate="no" dir="ltr">@color</code>. You can add this property anywhere inside the <code translate="no" dir="ltr">TextView</code> code.</li>
</ol>
<p>A menu pops up offering the predefined color resources:</p>
<p class="image-container"><img alt="f08dbc2b6d4fc39.png" style="width: 444.00px" src="/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f08dbc2b6d4fc39_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="4">
<li>Choose <strong>@color/colorPrimaryDark.</strong></li>
<li>Change the property <code translate="no" dir="ltr">android:textColor</code> and give it a value of <code translate="no" dir="ltr">@android:color/white</code>.</li>
</ol>
<p>The Android framework defines a range of colors, including white, so you don't have to define white yourself. 6. In the layout editor, you can see that the <code translate="no" dir="ltr">TextView</code> now has a dark blue background, and the text is displayed in white.</p>
<p class="image-container"><img alt="c0c2141dd09c7ea7.png" style="width: 153.64px" src="/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c0c2141dd09c7ea7_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-2:-add-a-new-color-to-use-as-the-screen-background-color" data-text="Step 2: Add a new color to use as the screen background color" tabindex="-1"><strong>Step 2: Add a new color to use as the screen background color</strong></h2>
<ol type="1">
<li>Back in <code translate="no" dir="ltr">colors.xml</code>, create a new color resource called <code translate="no" dir="ltr">screenBackground</code>:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"screenBackground"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#FFEE58</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>A  <a href="https://developer.android.com/reference/android/graphics/Color" target="_blank">Color</a> can be defined as 3 hexadecimal numbers (#00-#FF, or 0-255) representing the red, blue, and green (RGB) components.  The color you just added is yellow. Notice that the colors corresponding to the code are displayed in the left margin of the editor.</p>
<p class="image-container"><img alt="e2749d2e88ddf4a3.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e2749d2e88ddf4a3_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>Note that a color can also be defined including an alpha value (#00-#FF) which represents the transparency (#00 = 0% = fully transparent, #FF = 100% = fully opaque). When included, the alpha value is the first of 4 hexadecimal numbers (ARGB).</p>
<p>The alpha value is a measure of transparency. For example, #88FFEE58 makes the color semi-transparent, and if you use #00FFEE58, it's fully transparent and disappears from the left-hand bar.</p>
<ol type="1" start="2">
<li>Go back to <code translate="no" dir="ltr">fragment_first.xml</code>.</li>
<li>In the <strong>Component Tree</strong>, select the <code translate="no" dir="ltr">ConstraintLayout</code>. <img alt="98c54173559bb461.png" style="width: 317.00px" src="/static/codelabs/build-your-first-android-app/img/98c54173559bb461.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/98c54173559bb461_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>In the <strong>Attributes</strong> panel, select the <strong>background</strong> property and press <strong>Enter</strong>. Type "c" in the field that appears.</li>
<li>In the menu of colors that appears, select <strong>@color/screenBackground</strong>. Press <strong>Enter</strong> to complete the selection.</li>
</ol>
<p class="image-container"><img alt="4ad182142b7286e6.png" style="width: 411.00px" src="/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/4ad182142b7286e6_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="6">
<li>Click on the yellow patch to the left of the color value in the <strong>background</strong> field.</li>
</ol>
<p class="image-container"><img alt="825da5a9b24ce5ff.png" style="width: 297.00px" src="/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/825da5a9b24ce5ff_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>It shows a list of colors defined in <code translate="no" dir="ltr">colors.xml</code>. Click the <strong>Custom</strong> tab to choose a custom color with an interactive color chooser. <img alt="ebd2ec170406402a.png" style="width: 279.80px" src="/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ebd2ec170406402a_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="7">
<li>Feel free to change the value of the <strong>screenBackground</strong> color, but make sure that the final color is noticeably different from the <code translate="no" dir="ltr">colorPrimary</code> and <code translate="no" dir="ltr">colorPrimaryDark</code> colors.</li>
</ol>
<h2 is-upgraded="" id="step-3:-explore-width-and-height-properties" data-text="Step 3: Explore width and height properties" tabindex="-1"><strong>Step 3: Explore width and height properties</strong></h2>
<p>Now that you have a new screen background color, you will use it to explore the effects of changing the width and height properties of views.</p>
<ol type="1">
<li>In <code translate="no" dir="ltr">fragment_first.xml</code>, in the <strong>Component Tree</strong>, select the <code translate="no" dir="ltr">ConstraintLayout</code>.</li>
</ol>
<p class="image-container"><img alt="3b78c455704d36b8.png" style="width: 317.00px" src="/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/3b78c455704d36b8_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="2">
<li>In the <strong>Attributes</strong> panel, find and expand the <strong>Layout</strong> section. <img alt="ef495439c2df9fac.png" style="width: 287.00px" src="/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ef495439c2df9fac_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<p>The <strong>layout_width</strong> and <strong>layout_height</strong> properties are both set to <strong>match_parent</strong>. The <code translate="no" dir="ltr">ConstraintLayout</code> is the root view of this <code translate="no" dir="ltr">Fragment</code>, so the "parent" layout size is effectively the size of your screen.</p>
<aside class="special"><p><strong>Tip:</strong> All views must have <strong>layout_width</strong> and <strong>layout_height</strong> properties.</p>
</aside>
<ol type="1" start="3">
<li>Notice that the entire background of the screen uses the <strong>screenBackground</strong> color.</li>
</ol>
<p class="image-container"><img alt="6cda01dc20388d55.png" style="width: 215.71px" src="/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cda01dc20388d55_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="4">
<li>Select <code translate="no" dir="ltr">textview_first</code>. Currently the layout width and height are <strong>wrap_content</strong>, which tells the view to be just big enough to enclose its content (plus padding)</li>
<li>Change both the layout width and layout height to <strong>match_constraint</strong>, which tells the view to be as big as whatever it's constrained to.</li>
</ol>
<p>The width and height show <strong>0dp</strong>, and the text moves to the upper left, while the <code translate="no" dir="ltr">TextView</code> expands to match the <code translate="no" dir="ltr">ConstraintLayout</code> except for the button. The button and the text view are at the same level in the view hierarchy inside the constraint layout, so they share space.</p>
<p class="image-container"><img alt="b8740b4dc43dc9c4.png" style="width: 233.00px" src="/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b8740b4dc43dc9c4_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="6">
<li>Explore what happens if the width is <strong>match_constraint</strong> and the height is <strong>wrap_content</strong> and vice versa. You can also change the width and height of the button_first.</li>
<li>Set both the width and height of the <code translate="no" dir="ltr">TextView</code> and the <code translate="no" dir="ltr">Button</code> back to <strong>wrap_content</strong>.</li>
</ol>


        </div></div></google-codelab-step><google-codelab-step label="Task: Add views and constraints" duration="0" step="5" tabindex="-1" style="transform: translate3d(-110%, 0px, 0px);"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#5">6. Task: Add views and constraints</a></h2>
          
          
          <p>In this task, you will add two more buttons to your user interface, and update the existing button, as shown below.</p>
<p class="image-container"><img alt="94e4cf7f4bb5264b.png" style="width: 226.55px" src="/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/94e4cf7f4bb5264b_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_4" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to add new views to your layout.</li>
<li>How to constrain the position of a view to another view.</li>
</ul>
<h2 is-upgraded="" id="step-1:-view-constraint-properties" data-text="Step 1: View constraint properties" tabindex="-1"><strong>Step 1: View constraint properties</strong></h2>
<ol type="1">
<li>In <code translate="no" dir="ltr">fragment_first.xml</code>, look at the constraint properties for the <code translate="no" dir="ltr">TextView</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintBottom_toTopOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@id/button_first"</span></span><span class="pln"><span class="pln"><br>app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintEnd_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"parent"</span></span><span class="pln"><span class="pln"><br>app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintStart_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"parent"</span></span><span class="pln"><span class="pln"><br>app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintTop_toTopOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"parent"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>These properties define the position of the <code translate="no" dir="ltr">TextView</code>. Read them carefully.</p>
<p>You can constrain the top, bottom, left, and right of a view to the top, bottom, left, and right of other views.</p>
<ol type="1" start="2">
<li>Select <code translate="no" dir="ltr">textview_first</code> in the <strong>Component Tree</strong> and look at the <strong>Constraint Widget</strong> in the <strong>Attributes</strong> panel.</li>
</ol>
<p class="image-container"><img alt="938d3a1c319e1f.png" style="width: 297.00px" src="/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/938d3a1c319e1f_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The square represents the selected view. Each of the grey dots represents a constraint, to the top, bottom, left, and right; for this example, from the <code translate="no" dir="ltr">TextView</code> to its parent, the <code translate="no" dir="ltr">ConstraintLayout</code>, or to the <strong>Next</strong> button for the bottom constraint. 3. Notice that the blueprint and design views also show the constraints when a particular view is selected. Some of the constraints are jagged lines, but the one to the <strong>Next</strong> button is a squiggle, because it's a little different. You'll learn more about that in a bit. <img alt="7d73d3d74c8ebbb9.png" style="width: 332.59px" src="/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7d73d3d74c8ebbb9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-2:-add-buttons-and-constrain-their-positions" data-text="Step 2: Add buttons and constrain their positions" tabindex="-1"><strong>Step 2: Add buttons and constrain their positions</strong></h2>
<p>To learn how to use constraints to connect the positions of views to each other, you will add buttons to the layout. Your first goal is to add a button and some constraints, and change the constraints on the <strong>Next</strong> button.</p>
<ol type="1">
<li>Notice the <strong>Palette</strong> at the top left of the layout editor. Move the sides if you need to, so that you can see many of the items in the palette.</li>
</ol>
<p class="image-container"><img alt="47603a2d993c378b.png" style="width: 226.29px" src="/static/codelabs/build-your-first-android-app/img/47603a2d993c378b.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47603a2d993c378b_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="2">
<li>Click on some of the categories, and scroll the listed items if needed to get an idea of what's available.</li>
<li>Select <strong>Button</strong>, which is near the top, and drag and drop it onto the design view, placing it underneath the <code translate="no" dir="ltr">TextView</code> near the other button.</li>
</ol>
<p class="image-container"><img alt="91ddff47af3cde61.png" style="width: 247.57px" src="/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/91ddff47af3cde61_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>Notice that a <code translate="no" dir="ltr">Button</code> has been added to the <strong>Component Tree</strong> under <code translate="no" dir="ltr">ConstraintLayout</code>.</p>
<h2 is-upgraded="" id="step-3:-add-a-constraint-to-the-new-button" data-text="Step 3: Add a constraint to the new button" tabindex="-1"><strong>Step 3: Add a constraint to the new button</strong></h2>
<p>You will now constrain the top of the button to the bottom of the <code translate="no" dir="ltr">TextView</code>.</p>
<ol type="1">
<li>Move the cursor over the circle at the top of the <code translate="no" dir="ltr">Button</code>.</li>
</ol>
<p class="image-container"><img alt="d692d553fdb8d06c.png" style="width: 163.00px" src="/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/d692d553fdb8d06c_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="2">
<li>Click and drag the circle at the top of the <code translate="no" dir="ltr">Button</code> onto the circle at the bottom of the <code translate="no" dir="ltr">TextView</code>.</li>
</ol>
<p class="image-container"><img alt="9e7bcb556cd2b58c.png" style="width: 118.50px" src="/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9e7bcb556cd2b58c_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The <code translate="no" dir="ltr">Button</code> moves up to sit just below the <code translate="no" dir="ltr">TextView</code> because the top of the button is now <em>constrained</em> to the bottom of the <code translate="no" dir="ltr">TextView</code>.</p>
<p class="image-container"><img alt="7aa4fd347b3ebde9.png" style="width: 129.50px" src="/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7aa4fd347b3ebde9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="4">
<li>Take a look at the <strong>Constraint Widget</strong> in the <strong>Layout</strong> pane of the <strong>Attributes</strong> panel. It shows some constraints for the <code translate="no" dir="ltr">Button</code>, including <strong>Top -&gt; BottomOf textView</strong>.</li>
<li>Take a look at the XML code for the button. It now includes the attribute that constrains the top of the button to the bottom of the <code translate="no" dir="ltr">TextView</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintTop_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@+id/textview_first"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="6">
<li>You may see a warning, "<strong>Not Horizontally Constrained</strong>". To fix this, add a constraint from the left side of the button to the left side of the screen.</li>
<li>Also add a constraint to constrain the bottom of the button to the bottom of the screen.</li>
</ol>
<p>Before adding another button, relabel this button so things are a little clearer about which button is which.</p>
<ol type="1">
<li>Click on the button you just added in the design layout.</li>
<li>Look at the <strong>Attributes</strong> panel on the right, and notice the <strong>id</strong> field.</li>
<li>Change the <strong>id</strong> from <code translate="no" dir="ltr">button</code> to <code translate="no" dir="ltr">toast_button</code>.</li>
</ol>
<h2 is-upgraded="" id="step-4:-adjust-the-next-button" data-text="Step 4: Adjust the Next button" tabindex="-1"><strong>Step 4: Adjust the Next button</strong></h2>
<p>You will adjust the button labeled <strong>Next</strong>, which Android Studio created for you when you created the project. The constraint between it and the <code translate="no" dir="ltr">TextView</code> looks a little different, a wavy line instead of a jagged one, with no arrow. This indicates a  <a href="https://developer.android.com/reference/android/support/constraint/ConstraintLayout#Chains" target="_blank"><em>chain</em></a>, where the constraints link two or more objects to each other, instead of just one to another. For now, you'll delete the chained constraints and replace them with regular constraints.</p>
<h3 is-upgraded="" id="to-delete-a-constraint:" data-text="To delete a constraint:" tabindex="-1"><strong>To delete a constraint:</strong></h3>
<ul>
<li>In the design view or blueprint view, hold the <code translate="no" dir="ltr">Ctrl</code> key (<code translate="no" dir="ltr">Command</code> on a Mac) and move the cursor over the circle for the constraint until the circle highlights, then click the circle. <img alt="1f8c250ad15873d5.png" style="width: 186.55px" src="/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/1f8c250ad15873d5_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Or click on one of the constrained views, then right-click on the constraint and select <strong>Delete</strong> from the menu.</li>
<li>Or in the  <strong>Attributes</strong> panel, move the cursor over the circle for the constraint until it shows an x, then click it.</li>
</ul>
<p class="image-container"><img alt="7f4931356c145bab.png" style="width: 257.08px" src="/static/codelabs/build-your-first-android-app/img/7f4931356c145bab.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7f4931356c145bab_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>If you delete a constraint and want it back, either undo the action, or create a new constraint.</p>
<h2 is-upgraded="" id="step-5:-delete-the-chain-constraints" data-text="Step 5: Delete the chain constraints" tabindex="-1"><strong>Step 5: Delete the chain constraints</strong></h2>
<ol type="1">
<li>Click on the <strong>Next</strong> button, and then delete the constraint from the top of the button to the <code translate="no" dir="ltr">TextView</code>.</li>
<li>Click on the <code translate="no" dir="ltr">TextView</code>, and then delete the constraint from the bottom of the text to the <strong>Next</strong> button.</li>
</ol>
<h2 is-upgraded="" id="step-6:-add-new-constraints" data-text="Step 6: Add new constraints" tabindex="-1"><strong>Step 6: Add new constraints</strong></h2>
<ol type="1">
<li>Constrain the right side of the <strong>Next</strong> button to the right of the screen if it isn't already.</li>
<li>Delete the constraint on the left side of the <strong>Next</strong> button.</li>
<li>Now constrain the top and bottom of the <strong>Next</strong> button so that the top of the button is constrained to the bottom of the <code translate="no" dir="ltr">TextView</code> and  the bottom is constrained to the bottom of the screen. The right side of the button is constrained to the right side of the screen.</li>
<li>Also constrain the <code translate="no" dir="ltr">TextView</code> to the bottom of the screen.</li>
</ol>
<p>It may seem like the views are jumping around a lot, but that's normal as you add and remove constraints.</p>
<p>Your layout should now look something like this.</p>
<p class="image-container"><img alt="7fb69c02100a87f6.png" style="width: 335.62px" src="/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7fb69c02100a87f6_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-7:-extract-string-resources" data-text="Step 7: Extract string resources" tabindex="-1"><strong>Step 7: Extract string resources</strong></h2>
<ol type="1">
<li>In the <code translate="no" dir="ltr">fragment_first.xml</code> layout file, find the text property for the <strong><code translate="no" dir="ltr">toast_button</code></strong> button.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&lt;Button<br>&nbsp; &nbsp;android:id="@+id/toast_button"<br>&nbsp; &nbsp;android:layout_width="wrap_content"<br>&nbsp; &nbsp;android:layout_height="wrap_content"<br>&nbsp; &nbsp;android:text="Button"<br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>Notice that the text <code translate="no" dir="ltr">"Button"</code> is directly in the layout field, instead of referencing a string resource as the <code translate="no" dir="ltr">TextView</code> does. This will make it harder to translate your app to other languages.</li>
<li>To fix this, click the highlighted code. A light bulb appears on the left.</li>
</ol>
<p class="image-container"><img alt="47544075e3e5ecdb.png" style="width: 429.00px" src="/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/47544075e3e5ecdb_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="4">
<li>Click the lightbulb. In the menu that pops up, select <strong>Extract string resource</strong>. <img alt="ca47cfeb06a1602.png" style="width: 400.00px" src="/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ca47cfeb06a1602_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>In the dialog box that appears, change the resource name to <code translate="no" dir="ltr">toast_button_text</code> and the resource value to <code translate="no" dir="ltr">Toast</code> and click <strong>OK</strong>.</li>
</ol>
<p class="image-container"><img alt="8fa866598929c1b4.png" style="width: 291.00px" src="/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/8fa866598929c1b4_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="6">
<li>Notice that the value of the <code translate="no" dir="ltr">android:text</code> property has changed to <code translate="no" dir="ltr">@string/toast_button_text</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&lt;Button<br>&nbsp; &nbsp;android:id="@+id/button"<br>&nbsp; &nbsp;android:layout_width="wrap_content"<br>&nbsp; &nbsp;android:layout_height="wrap_content"<br>&nbsp; &nbsp;android:text="@string/toast_button_text"<br></span></span></code></pre></devsite-code>
<ol type="1" start="7">
<li>Go to the <strong>res &gt; values &gt; strings.xml</strong> file. Notice that a new string resource has been added, named <code translate="no" dir="ltr">toast_button_text</code><strong>.</strong></li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;resources&gt;</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;... <br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;string</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"toast_button_text"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">Toast</span></span><span class="tag"><span class="tag">&lt;/string&gt;</span></span><span class="pln"><span class="pln"><br></span></span><span class="tag"><span class="tag">&lt;/resources&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="8">
<li>Run the app to make sure it displays as you expect it to.</li>
</ol>
<p class="image-container"><img alt="73c7729f2d8329df.png" style="width: 270.44px" src="/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/73c7729f2d8329df_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>You now know how to create new string resources by extracting them from existing field values. (You can also add new resources to the <code translate="no" dir="ltr">strings.xml</code> file manually.) And you know how to change the id of a view.</p>
<aside class="special"><p><strong>Note</strong>: The  <a href="https://developer.android.com/reference/android/view/View#ids" target="_blank">id</a> for a view helps you identify that view distinctly from other views. You'll use this later to find particular views using the <code translate="no" dir="ltr">findViewById()</code> method in your Java code.</p>
</aside>
<h2 is-upgraded="" id="step-8:-update-the-next-button" data-text="Step 8: Update the Next button" tabindex="-1"><strong>Step 8: Update the Next button</strong></h2>
<p>The <strong>Next</strong> button already has its text in a string resource, but you'll make some changes to the button to match its new role, which will be to generate and display a random number.</p>
<ol type="1">
<li>As you did for the <strong>Toast</strong> button, change the id of the <strong>Next</strong> button from <code translate="no" dir="ltr">button_first</code> to <code translate="no" dir="ltr">random_button</code> in the <strong>Attributes</strong> panel.</li>
<li>If you get a dialog box asking to update all usages of the button, click <strong>Yes</strong>. This will fix any other references to the button in the project code. <img alt="434e77fabe53b6a3.png" style="width: 448.00px" src="/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/434e77fabe53b6a3_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>In <code translate="no" dir="ltr">strings.xml</code>, right-click on the <code translate="no" dir="ltr">next</code> string resource.</li>
<li>Select <strong>Refactor &gt; Rename...</strong> and change the name to <code translate="no" dir="ltr">random_button_text</code>.</li>
<li>Click <strong>Refactor</strong> to rename your string and close the dialog.</li>
<li>Change the value of the string from <code translate="no" dir="ltr">Next</code> to <code translate="no" dir="ltr">Random</code>.</li>
<li>If you want, move <code translate="no" dir="ltr">random_button_text</code> to below <code translate="no" dir="ltr">toast_button_text</code>.</li>
</ol>
<h2 is-upgraded="" id="step-9:-add-a-third-button" data-text="Step 9: Add a third button" tabindex="-1"><strong>Step 9: Add a third button</strong></h2>
<p>Your final layout will have three buttons, vertically constrained the same, and evenly spaced from each other.</p>
<p class="image-container"><img alt="7e6529faadd88569.png" style="width: 373.40px" src="/static/codelabs/build-your-first-android-app/img/7e6529faadd88569.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7e6529faadd88569_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1">
<li>In <code translate="no" dir="ltr">fragment_first.xml</code>, add another button to the layout, and drop it somewhere between the <strong>Toast</strong> button and the <strong>Random</strong> button, below the <code translate="no" dir="ltr">TextView</code>.</li>
<li>Add vertical constraints the same as the other two buttons. Constrain the top of the third button to the bottom of <code translate="no" dir="ltr">TextView</code>; constrain the bottom of the third button to the bottom of the screen.</li>
<li>Add horizontal constraints from the third button to the other buttons. Constrain the left side of the third button to the right side of the <strong>Toast</strong> button; constrain the right side of the third button to the left side of the <strong>Random</strong> button.</li>
</ol>
<p>Your layout should look something like this:</p>
<p class="image-container"><img alt="7588895a67295422.png" style="width: 256.50px" src="/static/codelabs/build-your-first-android-app/img/7588895a67295422.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7588895a67295422_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="5">
<li>Examine the XML code for <code translate="no" dir="ltr">fragment_first.xml</code>. Do any of the buttons have the attribute <code translate="no" dir="ltr">app:layout_constraintVertical_bias</code>? It's OK if you do not see that constraint.</li>
</ol>
<p>The "bias" constraints allows you to tweak the position of a view to be more on one side than the other when both sides are  <a href="https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html#CenteringPositioning" target="_blank">constrained in opposite directions</a>. For example, if both the top and bottom sides of a view are constrained to the top and bottom of the screen, you can use a vertical bias to place the view more towards the top than the bottom.</p>
<p>Here is the XML code for the finished layout. Your layout might have different margins and perhaps some different vertical or horizontal bias constraints.The exact values of the attributes for the appearance of the <code translate="no" dir="ltr">TextView</code> might be different for your app.</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pun"><span class="pun">&lt;?</span></span><span class="pln"><span class="pln">xml version</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"1.0"</span></span><span class="pln"><span class="pln"> encoding</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"utf-8"</span></span><span class="pun"><span class="pun">?&gt;</span></span><span class="pln"><span class="pln"><br>&lt;androidx.constraintlayout.widget.ConstraintLayout </span></span><span class="pun"><span class="pun">&lt;?</span></span><span class="pln"><span class="pln">xml version</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"1.0"</span></span><span class="pln"><span class="pln"> encoding</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"utf-8"</span></span><span class="pun"><span class="pun">?&gt;</span></span><span class="pln"><span class="pln"><br></span></span><span class="tag"><span class="tag">&lt;androidx.constraintlayout.widget.ConstraintLayout</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">xmlns:android</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"http://schemas.android.com/apk/res/android"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">xmlns:app</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"http://schemas.android.com/apk/res-auto"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">xmlns:tools</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"http://schemas.android.com/tools"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"match_parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"match_parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:background</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@color/screenBackground"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">tools:context</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">".FirstFragment"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;TextView</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_first"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:background</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@color/colorPrimaryDark"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:fontFamily</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"sans-serif-condensed"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@string/hello_first_fragment"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textColor</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@android:color/white"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textSize</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"30sp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textStyle</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"bold"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintBottom_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintEnd_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintStart_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toTopOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;Button</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/random_button"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@string/random_button_text"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintBottom_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintEnd_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_first"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;Button</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/toast_button"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@string/toast_button_text"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintBottom_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintStart_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_first"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="tag"><span class="tag">&lt;Button</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/button2"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"Button"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintBottom_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintEnd_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/random_button"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintStart_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/toast_button"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_first"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br></span></span><span class="tag"><span class="tag">&lt;/androidx.constraintlayout.widget.ConstraintLayout&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-10:-get-your-ui-ready-for-the-next-task" data-text="Step 10: Get your UI ready for the next task" tabindex="-1"><strong>Step 10: Get your UI ready for the next task</strong></h2>
<p>The next task is to make the buttons do something when they are pressed. First, you need to get the UI ready.</p>
<ol type="1">
<li>Change the text of the <code translate="no" dir="ltr">TextView</code> to show <strong>0</strong> (the number zero).</li>
<li>Change the <code translate="no" dir="ltr">id</code> of the last button you added, <code translate="no" dir="ltr">button2</code>, to <code translate="no" dir="ltr">count_button</code> in the <strong>Attributes</strong> panel in the design editor.</li>
<li>In the XML, extract the string resource to <code translate="no" dir="ltr">count_button_text</code> and set the value to <code translate="no" dir="ltr">Count.</code></li>
<li><img alt="bbe0bcab6903ea27.png" style="width: 289.05px" src="/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/bbe0bcab6903ea27_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<p>The buttons should now have the following text and ids:</p>
<div class="devsite-table-wrapper"><table class="vertical-rules">
<tbody><tr><td colspan="1" rowspan="1"><p><strong>Button</strong></p>
</td><td colspan="1" rowspan="1"><p><strong>text</strong></p>
</td><td colspan="1" rowspan="1"><p><strong>id</strong></p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p>Left button</p>
</td><td colspan="1" rowspan="1"><p>Toast</p>
</td><td colspan="1" rowspan="1"><p>@+id/toast_button</p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p>Middle button</p>
</td><td colspan="1" rowspan="1"><p>Count</p>
</td><td colspan="1" rowspan="1"><p>@+id/count_button</p>
</td></tr>
<tr><td colspan="1" rowspan="1"><p>Right button</p>
</td><td colspan="1" rowspan="1"><p>Random</p>
</td><td colspan="1" rowspan="1"><p>@+id/random_button</p>
</td></tr>
</tbody></table></div>
<ol type="1" start="5">
<li>Run the app.</li>
</ol>
<h2 is-upgraded="" id="step-11:-fix-errors-if-necessary" data-text="Step 11: Fix errors if necessary" tabindex="-1"><strong>Step 11: Fix errors if necessary</strong></h2>
<aside class="warning"><p>If you edited the XML for the layout directly, you might see some errors.</p>
</aside>
<p class="image-container"><img alt="c01516073934ed58.png" style="width: 469.40px" src="/static/codelabs/build-your-first-android-app/img/c01516073934ed58.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c01516073934ed58_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>The errors occur because the buttons have changed their <code translate="no" dir="ltr">id</code> and now these constraints are referencing non-existent views.</p>
<p>If you have these errors, fix them by updating the <code translate="no" dir="ltr">id</code> of the buttons in the constraints that are underlined in red.</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintEnd_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@+id/random_button"</span></span><span class="pln"><span class="pln"><br>app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintStart_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@+id/toast_button"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>


        </div></div></google-codelab-step><google-codelab-step label="Task: Update the appearance of the buttons and the TextView" duration="0" step="6" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#6">7. Task: Update the appearance of the buttons and the TextView</a></h2>
          
          
          <p>Your app's layout is now basically complete, but its appearance can be improved with a few small changes.</p>
<h2 is-upgraded="" id="step-1:-add-new-color-resources" data-text="Step 1: Add new color resources" tabindex="-1"><strong>Step 1: Add new color resources</strong></h2>
<ol type="1">
<li>In <code translate="no" dir="ltr">colors.xml</code>, change the value of <code translate="no" dir="ltr">screenBackground</code> to <code translate="no" dir="ltr">#2196F3</code>, which is a blue shade in the  <a href="https://material.io/guidelines/style/color.html#color-color-palette" target="_blank">Material Design palette</a>.</li>
<li>Add a new color named <code translate="no" dir="ltr">buttonBackground</code>. Use the value <code translate="no" dir="ltr">#BBDEFB</code>, which is a lighter shade in the blue palette.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"buttonBackground"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#BBDEFB</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-2:-add-a-background-color-for-the-buttons" data-text="Step 2: Add a background color for the buttons" tabindex="-1"><strong>Step 2: Add a background color for the buttons</strong></h2>
<ol type="1">
<li>In the layout, add a background color to each of the buttons. (You can either edit the XML in <code translate="no" dir="ltr">fragment_first.xml</code> or use the <strong>Attributes</strong> panel, whichever you prefer.)</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">android</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">background</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@color/buttonBackground"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-3:-change-the-margins-of-the-left-and-right-buttons" data-text="Step 3: Change the margins of the left and right buttons" tabindex="-1"><strong>Step 3: Change the margins of the left and right buttons</strong></h2>
<ol type="1">
<li>Give the <strong>Toast</strong> button a left (start) margin of 24dp and give the <strong>Random</strong> button a right (end) margin of 24dp. (Using start and end instead of left and right makes these margins work for all language directions.)</li>
</ol>
<p>One way to do this is to use the <strong>Constraint Widget</strong> in the <strong>Attributes</strong> panel. The number on each side is the margin on that side of the selected view. Type <code translate="no" dir="ltr">24</code> in the field and press <strong>Enter</strong>. <img alt="81c294a2cf04b801.png" style="width: 272.00px" src="/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81c294a2cf04b801_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-4:-update-the-appearance-of-the-textview" data-text="Step 4: Update the appearance of the TextView" tabindex="-1"><strong>Step 4: Update the appearance of the TextView</strong></h2>
<ol type="1">
<li>Remove the background color of the <code translate="no" dir="ltr">TextView</code>, either by clearing the value in the <strong>Attributes</strong> panel or by removing the <code translate="no" dir="ltr">android:background</code> attribute from the XML code.</li>
</ol>
<p>When you remove the background, the view background becomes transparent. 2. Increase the text size of the <code translate="no" dir="ltr">TextView</code> to 72sp.</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">android</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">textSize</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"72sp"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Change the font-family of the <code translate="no" dir="ltr">TextView</code> to <code translate="no" dir="ltr">sans-serif</code> (if it's not already).</li>
<li>Add an <code translate="no" dir="ltr">app:layout_constraintVertical_bias</code> property to the <code translate="no" dir="ltr">TextView</code>, to bias the position of the view upwards a little so that it is more evenly spaced vertically in the screen. Feel free to adjust the value of this constraint as you like. (Check in the design view to see how the layout looks.)</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">app</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">layout_constraintVertical_bias</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"0.3"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>You can also set the vertical bias using the <strong>Constraint Widget</strong>. Click and drag the number <strong>50</strong> that appears on the left side, and slide it upwards until it says <strong>30</strong>. <img alt="7c73e04dc2f35d00.png" style="width: 276.00px" src="/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/7c73e04dc2f35d00_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<aside class="special"><p><strong>Tip</strong>: Using the bias attribute instead of margins or padding results in a more pleasing layout on different screen sizes and orientations.</p>
<ul>
<li>If a view is constrained to other views on both its top and bottom edges, use vertical bias to tweak its vertical position.</li>
<li>If a view is constrained on both its left and right edges, use horizontal bias to tweak its horizontal position.</li>
</ul>
</aside>
<ol type="1" start="6">
<li>Make sure the <strong>layout_width</strong> is <strong>wrap_content</strong>, and the horizontal bias is 50 (<code translate="no" dir="ltr">app:layout_constraintHorizontal_bias="0.5"</code> in XML).</li>
</ol>
<h2 is-upgraded="" id="step-5:-run-your-app" data-text="Step 5: Run your app" tabindex="-1"><strong>Step 5: Run your app</strong></h2>
<p>If you implemented all the updates, your app will look like the following figure. If you used different colors and fonts, then your app will look a bit different.</p>
<p class="image-container"><img alt="214cfb8299ed8d36.png" style="width: 285.50px" src="/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/214cfb8299ed8d36_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>


        </div></div></google-codelab-step><google-codelab-step label="Task: Make your app interactive" duration="0" step="7" tabindex="-1"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#7">8. Task: Make your app interactive</a></h2>
          
          
          <p>You have added buttons to your app's main screen, but currently the buttons do nothing. In this task, you will make your buttons respond when the user presses them.</p>
<p>First you will make the <strong>Toast</strong> button show a pop-up message called a  <a href="https://developer.android.com/guide/topics/ui/notifiers/toasts" target="_blank"><em>toast</em></a>. Next you will make the <strong>Count</strong> button update the number that is displayed in the <code translate="no" dir="ltr">TextView</code>.</p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_5" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to find a view by its ID.</li>
<li>How to add click listeners for a view.</li>
<li>How to set and get property values of a view from your code.</li>
</ul>
<h2 is-upgraded="" id="step-1:-enable-auto-imports" data-text="Step 1: Enable auto imports" tabindex="-1"><strong>Step 1: Enable auto imports</strong></h2>
<p>To make your life easier, you can enable auto-imports so that Android Studio automatically imports any classes that are needed by the Java code.</p>
<ol type="1">
<li>In Android Studio, open the settings editor by going to <strong>File</strong> &gt; <strong>Other Settings</strong> &gt; <strong>Preferences for New Projects</strong>.</li>
<li>Select <strong>Auto Imports</strong>. In the <strong>Java</strong> section, make sure <strong>Add Unambiguous Imports on the fly</strong> is checked.</li>
</ol>
<p><img alt="5507aa63b0db10d5.png" style="width: 491.80px" src="/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/5507aa63b0db10d5_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> 3. Close the settings editor by pressing <strong>OK</strong>.</p>
<h2 is-upgraded="" id="step-2:-show-a-toast" data-text="Step 2: Show a toast" tabindex="-1"><strong>Step 2: Show a toast</strong></h2>
<p>In this step, you will attach a Java method to the <strong>Toast</strong> button to show a toast when the user presses the button. A toast is a short message that appears briefly at the bottom of the screen.</p>
<p class="image-container"><img alt="b3d6daf5bb6784d9.png" style="width: 284.50px" src="/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1">
<li>Open <code translate="no" dir="ltr">FirstFragment.java</code> (<strong>app</strong> &gt; <strong>java</strong> &gt; <strong>com.example.android.myfirstapp &gt; FirstFragment</strong>).</li>
</ol>
<p>This class has only two methods, <code translate="no" dir="ltr">onCreateView()</code> and <code translate="no" dir="ltr">onViewCreated()</code>. These methods execute when the fragment starts.</p>
<p>As mentioned earlier, the  <a href="https://developer.android.com/reference/android/view/View#ids" target="_blank">id</a> for a view helps you identify that view distinctly from other views. Using the <code translate="no" dir="ltr">findViewByID()</code> method, your code can find the <code translate="no" dir="ltr">random_button</code> using its id, <code translate="no" dir="ltr">R.id.random_button</code>. 2. Take a look at <code translate="no" dir="ltr">onViewCreated()</code>. It sets up a click listener for the <code translate="no" dir="ltr">random_button</code>, which was originally created as the <strong>Next</strong> button.</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">random_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">NavHostFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findNavController</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">FirstFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="kwd"><span class="kwd">this</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">navigate</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">action_FirstFragment_to_SecondFragment</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>Here is what this code does:</p>
<ul>
<li>Use the <code translate="no" dir="ltr">findViewById()</code> method with the id of the desired view as an argument, then set a click listener on that view.</li>
<li>In the body of the click listener, use an action, which in this case is for navigating to another fragment, and navigate there. (You will learn about that later.)</li>
</ul>
<ol type="1" start="3">
<li>Just below that click listener, add code to set up a click listener for the <code translate="no" dir="ltr">toast_button</code>, which creates and displays a toast. Here is the code:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">toast_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">Toast</span></span><span class="pln"><span class="pln"> myToast </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Toast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">makeText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">getActivity</span></span><span class="pun"><span class="pun">(),</span></span><span class="pln"><span class="pln"> </span></span><span class="str"><span class="str">"Hello toast!"</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Toast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">LENGTH_SHORT</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;myToast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">show</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Run the app and press the <strong>Toast</strong> button. Do you see the toasty message at the bottom of the screen? <img alt="b3d6daf5bb6784d9.png" style="width: 284.50px" src="/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/b3d6daf5bb6784d9_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>If you want, extract the message string into a resource as you did for the button labels.</li>
</ol>
<p>You have learned that to make a view interactive you need to set up a click listener for the view which says what to do when the view (button) is clicked on. The click listener can either:</p>
<ul>
<li>Implement a small amount of code directly.</li>
<li>Call a method that defines the desired click behavior in the activity.</li>
</ul>
<h2 is-upgraded="" id="step-3:-make-the-count-button-update-the-number-on-the-screen" data-text="Step 3: Make the Count button update the number on the screen" tabindex="-1"><strong>Step 3: Make the Count button update the number on the screen</strong></h2>
<p>The method that shows the toast is very simple; it does not interact with any other views in the layout. In the next step, you add behavior to your layout to find and update other views.</p>
<p>Update the <strong>Count</strong> button so that when it is pressed, the number on the screen increases by 1.</p>
<ol type="1">
<li>In the <code translate="no" dir="ltr">fragment_first.xml</code> layout file, notice the <code translate="no" dir="ltr">id</code> for the <code translate="no" dir="ltr">TextView</code>:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&lt;TextView<br>&nbsp; &nbsp;android:id="@+id/textview_first"<br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>In <code translate="no" dir="ltr">FirstFragment.java</code>, add a click listener for the <code translate="no" dir="ltr">count_button</code> below the other click listeners in <code translate="no" dir="ltr">onViewCreated()</code>. Because it has a little more work to do, have it call a new method, <code translate="no" dir="ltr">countMe()</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">count_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;countMe</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>In the <code translate="no" dir="ltr">FirstFragment</code> class, add the method <code translate="no" dir="ltr">countMe()</code> that takes a single <code translate="no" dir="ltr">View</code> argument. This method will be invoked when the <strong>Count</strong> button is clicked and the click listener called.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">private</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> countMe</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; <br></span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Get the value of the <code translate="no" dir="ltr">showCountTextView</code>. You will define that in the next step.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">...</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="com"><span class="com">// Get the value of the text view</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="typ"><span class="typ">String</span></span><span class="pln"><span class="pln"> countString </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getText</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>Convert the value to a number, and increment it.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">...</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="com"><span class="com">// Convert value to a number and increment it</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="typ"><span class="typ">Integer</span></span><span class="pln"><span class="pln"> count </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Integer</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">parseInt</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">countString</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; count</span></span><span class="pun"><span class="pun">++;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="6">
<li>Display the new value in the <code translate="no" dir="ltr">TextView</code> by programmatically setting the <code translate="no" dir="ltr">text</code> property of the <code translate="no" dir="ltr">TextView</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">...</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Display the new value in the text view.</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">setText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">count</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">());</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>Here is the whole method:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">private</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> countMe</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Get the value of the text view</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="typ"><span class="typ">String</span></span><span class="pln"><span class="pln"> countString </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getText</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Convert value to a number and increment it</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="typ"><span class="typ">Integer</span></span><span class="pln"><span class="pln"> count </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Integer</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">parseInt</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">countString</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;count</span></span><span class="pun"><span class="pun">++;</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Display the new value in the text view.</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">setText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">count</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">());</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-4:-cache-the-textview-for-repeated-use" data-text="Step 4: Cache the TextView for repeated use" tabindex="-1"><strong>Step 4: Cache the TextView for repeated use</strong></h2>
<p>You could call <code translate="no" dir="ltr">findViewById()</code> in <code translate="no" dir="ltr">countMe()</code> to find <code translate="no" dir="ltr">showCountTextView</code>. However, <code translate="no" dir="ltr">countMe()</code> is called every time the button is clicked, and <code translate="no" dir="ltr">findViewById()</code> is a relatively time consuming method to call. So it is better to find the view once and cache it.</p>
<ol type="1">
<li>In the <code translate="no" dir="ltr">FirstFragment</code> class before any methods, add a member variable for <code translate="no" dir="ltr">showCountTextView</code> of type <code translate="no" dir="ltr">TextView</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">TextView</span></span><span class="pln"><span class="pln"> showCountTextView</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>In <code translate="no" dir="ltr">onCreateView()</code>, you will call <code translate="no" dir="ltr">findViewById()</code> to get the <code translate="no" dir="ltr">TextView</code> that shows the count. The <code translate="no" dir="ltr">findViewById()</code> method must be called on a <code translate="no" dir="ltr">View</code> where the search for the requested ID should start, so assign the layout view that is currently returned to a new variable, <code translate="no" dir="ltr">fragmentFirstLayout</code>, instead.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="com"><span class="com">// Inflate the layout for this fragment</span></span><span class="pln"><span class="pln"><br></span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> fragmentFirstLayout </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> inflater</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">inflate</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">layout</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">fragment_first</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> container</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">false</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Call <code translate="no" dir="ltr">findViewById()</code> on <code translate="no" dir="ltr">fragmentFirstLayout</code>, and specify the <code translate="no" dir="ltr">id</code> of the view to find, <code translate="no" dir="ltr">textview_first</code>. Cache that value in <code translate="no" dir="ltr">showCountTextView</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">...</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; </span></span><span class="com"><span class="com">// Get the count text view</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; showCountTextView </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> fragmentFirstLayout</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">textview_first</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Return <code translate="no" dir="ltr">fragmentFirstLayout</code> from <code translate="no" dir="ltr">onCreateView()</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">return</span></span><span class="pln"><span class="pln"> fragmentFirstLayout</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>Here is the whole method and the declaration of <code translate="no" dir="ltr">showCountTextView</code>:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">TextView</span></span><span class="pln"><span class="pln"> showCountTextView</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br><br></span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br></span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> onCreateView</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">LayoutInflater</span></span><span class="pln"><span class="pln"> inflater</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">ViewGroup</span></span><span class="pln"><span class="pln"> container</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">Bundle</span></span><span class="pln"><span class="pln"> savedInstanceState<br></span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Inflate the layout for this fragment</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> fragmentFirstLayout </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> inflater</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">inflate</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">layout</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">fragment_first</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> container</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">false</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="com"><span class="com">// Get the count text view</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;showCountTextView </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> fragmentFirstLayout</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">textview_first</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">return</span></span><span class="pln"><span class="pln"> fragmentFirstLayout</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>Run your app. Press the <strong>Count</strong> button and watch the count update.</li>
</ol>
<h2 is-upgraded="" id="heading" data-text="" tabindex="-1"><img alt="f2b19b9209cad4f4.png" style="width: 289.50px" src="/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/f2b19b9209cad4f4_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></h2>


        </div></div></google-codelab-step><google-codelab-step label="Task: Implement the second fragment" duration="0" step="8" tabindex="-1" style="transform: translate3d(0px, 0px, 0px);" selected=""><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#8">9. Task: Implement the second fragment</a></h2>
          
          
          <p>So far, you've focused on the first screen of your app. Next, you will update the <strong>Random</strong> button to display a random number between 0 and the current count on a second screen.</p>
<p class="image-container"><img alt="c7029fe48ec2a802.png" style="width: 286.74px" src="/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c7029fe48ec2a802_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 class="checklist" is-upgraded="" id="what-youll-learn_6" data-text="What you'll learn" tabindex="-1"><strong>What you'll learn</strong></h2>
<ul class="checklist">
<li>How to pass information to a second fragment.</li>
</ul>
<h2 is-upgraded="" id="update-the-layout-for-the-second-fragment" data-text="Update the layout for the second fragment" tabindex="-1"><strong>Update the layout for the second fragment</strong></h2>
<p>The screen for the new fragment will display a heading title and the random number. Here is what the screen will look like in the design view: <img alt="a991c2db96dcafb3.png" style="width: 327.71px" src="/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a991c2db96dcafb3_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"> The <strong>%d</strong> indicates that part of the string will be replaced with a number. The <strong>R</strong> is just a placeholder.</p>
<h2 is-upgraded="" id="step-1:-add-a-textview-for-the-random-number" data-text="Step 1: Add a TextView for the random number" tabindex="-1"><strong>Step 1: Add a TextView for the random number</strong></h2>
<ol type="1">
<li>Open <code translate="no" dir="ltr">fragment_second.xml</code> (<strong>app &gt; res &gt; layout &gt; fragment_second.xml</strong>) and switch to <strong>Design View</strong> if needed. Notice that it has a <code translate="no" dir="ltr">ConstraintLayout</code> that contains a <code translate="no" dir="ltr">TextView</code> and a <code translate="no" dir="ltr">Button</code>.</li>
<li>Remove the chain constraints between the <code translate="no" dir="ltr">TextView</code> and the <code translate="no" dir="ltr">Button</code>. <img alt="e49352faab20c765.png" style="width: 205.50px" src="/static/codelabs/build-your-first-android-app/img/e49352faab20c765.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/e49352faab20c765_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
<li>Add another <code translate="no" dir="ltr">TextView</code> from the palette and drop it near the middle of the screen. This <code translate="no" dir="ltr">TextView</code> will be used to display a random number between 0 and the current count from the first <code translate="no" dir="ltr">Fragment</code>.</li>
<li>Set the <code translate="no" dir="ltr">id</code> to <strong><code translate="no" dir="ltr">@+id/textview_random</code></strong> (<code translate="no" dir="ltr">textview_random</code> in the <strong>Attributes</strong> panel.)</li>
<li>Constrain the top edge of the new <code translate="no" dir="ltr">TextView</code> to the bottom of the first <code translate="no" dir="ltr">TextView</code>, the left edge to the left of the screen, and the right edge to the right of the screen, and the bottom to the top of the <strong>Previous</strong> button.</li>
<li>Set both width and height to <strong>wrap_content</strong>.</li>
<li>Set the <strong>textColor</strong> to <strong>@android:color/white</strong>, set the <strong>textSize</strong> to <strong>72sp</strong>, and the <strong>textStyle</strong> to <strong>bold</strong>.</li>
</ol>
<p class="image-container"><img alt="81dc7122e9ddaea1.png" style="width: 238.20px" src="/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/81dc7122e9ddaea1_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="8">
<li>Set the text to "<code translate="no" dir="ltr">R</code>". This text is just a placeholder until the random number is generated.</li>
<li>Set the <strong>layout_constraintVertical_bias</strong> to <strong>0.45</strong>.</li>
</ol>
<p>This <code translate="no" dir="ltr">TextView</code> is constrained on all edges, so it's better to use a vertical bias than margins to adjust the vertical position, to help the layout look good on different screen sizes and orientations. 10. If you get a warning <strong>"Not Horizontally Constrained,"</strong> add a constraint from the start of the button to the left side of the screen and the end of the button to the right side of the screen.</p>
<p>Here is the XML code for the <code translate="no" dir="ltr">TextView</code> that displays the random number:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;TextView</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_random"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"R"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textColor</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@android:color/white"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textSize</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"72sp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textStyle</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"bold"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintBottom_toTopOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/button_second"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintEnd_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintStart_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toBottomOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_second"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintVertical_bias</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"0.45"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<h2 is-upgraded="" id="step-2:-update-the-textview-to-display-the-header" data-text="Step 2: Update the TextView to display the header" tabindex="-1"><strong>Step 2: Update the TextView to display the header</strong></h2>
<ol type="1">
<li>In <code translate="no" dir="ltr">fragment_second.xml</code>, select <code translate="no" dir="ltr">textview_second</code>, which currently has the text <code translate="no" dir="ltr">"Hello second fragment. Arg: %1$s"</code> in the <code translate="no" dir="ltr">hello_second_fragment</code> string resource.</li>
<li>If <code translate="no" dir="ltr">android:text</code> isn't set, set it to the <code translate="no" dir="ltr">hello_second_fragment</code> string resource.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">android</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">text</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@string/hello_second_fragment"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Change the <strong>id</strong> to <code translate="no" dir="ltr">textview_header</code> in the <strong>Attributes</strong> panel.</li>
<li>Set the width to <strong>match_constraint</strong>, but set the height to <strong>wrap_content</strong>, so the height will change as needed to match the height of the content.</li>
<li>Set top, left and right margins to <code translate="no" dir="ltr">24dp</code>. Left and right margins may also be referred to as "start" and "end" to support localization for right to left languages.</li>
<li>Remove any bottom constraint.</li>
<li>Set the text color to <code translate="no" dir="ltr">@color/colorPrimaryDark</code> and the text size to <code translate="no" dir="ltr">24sp</code>.</li>
<li>In <code translate="no" dir="ltr">strings.xml</code>, change <code translate="no" dir="ltr">hello_second_fragment</code> to "<code translate="no" dir="ltr">Here is a random number between 0 and %d.</code>"</li>
<li>Use <strong>Refactor &gt; Rename...</strong> to change the name of <code translate="no" dir="ltr">hello_second_fragment</code> to <code translate="no" dir="ltr">random_heading</code>.</li>
</ol>
<p>Here is the XML code for the <code translate="no" dir="ltr">TextView</code> that displays the heading:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;TextView</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:id</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@+id/textview_header"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_width</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"0dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_height</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"wrap_content"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_marginStart</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_marginLeft</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_marginTop</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_marginEnd</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:layout_marginRight</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24dp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:text</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@string/random_heading"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textColor</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"@color/colorPrimaryDark"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">android:textSize</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"24sp"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintEnd_toEndOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintStart_toStartOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="atn"><span class="atn">app:layout_constraintTop_toTopOf</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"parent"</span></span><span class="pln"><span class="pln"> </span></span><span class="tag"><span class="tag">/&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p class="image-container"><img alt="ff7f9969afbd67ff.png" style="width: 248.48px" src="/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/ff7f9969afbd67ff_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-3:-change-the-background-color-of-the-layout" data-text="Step 3: Change the background color of the layout" tabindex="-1"><strong>Step 3: Change the background color of the layout</strong></h2>
<p>Give your new activity a different background color than the first activity:</p>
<ol type="1">
<li>In <code translate="no" dir="ltr">colors.xml</code>, add a new color resource:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="tag"><span class="tag">&lt;color</span></span><span class="pln"><span class="pln"> </span></span><span class="atn"><span class="atn">name</span></span><span class="pun"><span class="pun">=</span></span><span class="atv"><span class="atv">"screenBackground2"</span></span><span class="tag"><span class="tag">&gt;</span></span><span class="pln"><span class="pln">#26C6DA</span></span><span class="tag"><span class="tag">&lt;/color&gt;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>In the layout for the second activity, <code translate="no" dir="ltr">fragment_second.xml</code>, set the background of the <code translate="no" dir="ltr">ConstraintLayout</code> to the new color.</li>
</ol>
<p>In the <strong>Attributes</strong> panel:</p>
<p class="image-container"><img alt="9948b482fb81ef5.png" style="width: 398.00px" src="/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/9948b482fb81ef5_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<p>Or in XML:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">android</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln">background</span></span><span class="pun"><span class="pun">=</span></span><span class="str"><span class="str">"@color/screenBackground2"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>Your app now has a completed layout for the second fragment. But if you run your app and press the <strong>Random</strong> button, it may crash. The click handler that Android Studio set up for that button needs some changes. In the next task, you will explore and fix this error.</p>
<h2 is-upgraded="" id="step-4:-examine-the-navigation-graph" data-text="Step 4: Examine the navigation graph" tabindex="-1"><strong>Step 4: Examine the navigation graph</strong></h2>
<p>When you created your project, you chose <strong>Basic Activity</strong> as the template for the new  project. When Android Studio uses the <strong>Basic Activity</strong> template for  a new project, it sets up two fragments, and a navigation graph to connect the two. It also set up a button to send a string argument from the first fragment to the second. This is the button you changed into the Random button. And now you want to send a number instead of a string.</p>
<ol type="1">
<li>Open <code translate="no" dir="ltr">nav_graph.xml</code> (<strong>app &gt; res &gt; navigation &gt; nav_graph.xml</strong>).</li>
</ol>
<p>A screen similar to the <strong>Layout Editor</strong> in <strong>Design</strong> view appears. It shows the two fragments with some arrows between them. You can zoom with <strong>+</strong> and <strong>-</strong> buttons in the lower right, as you did with the <strong>Layout Editor</strong>.</p>
<ol type="1" start="2">
<li>You can freely move the elements in the navigation editor. For example, if the fragments appear with <code translate="no" dir="ltr">SecondFragment</code> to the left, drag <code translate="no" dir="ltr">FirstFragment</code> to the left of <code translate="no" dir="ltr">SecondFragment</code> so they appear in the order you work with them.</li>
</ol>
<p class="image-container"><img alt="504c2156d46d4d6b.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/504c2156d46d4d6b_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<h2 is-upgraded="" id="step-5:-enable-safeargs" data-text="Step 5: Enable SafeArgs" tabindex="-1"><strong>Step 5: Enable SafeArgs</strong></h2>
<p>This will enable SafeArgs in Android Studio.</p>
<ol type="1">
<li>Open <strong>Gradle Scripts &gt; build.gradle (Project: My First App)</strong></li>
<li>Find the <code translate="no" dir="ltr">dependencies</code> section In the <code translate="no" dir="ltr">buildscript</code> section, and add the following lines after the other <code translate="no" dir="ltr">classpath</code> entries:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">def</span></span><span class="pln"><span class="pln"> nav_version </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="str"><span class="str">"2.3.0-alpha04"</span></span><span class="pln"><span class="pln"><br>classpath </span></span><span class="str"><span class="str">"androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Open <strong>Gradle Scripts &gt; build.gradle (Module: app)</strong></li>
<li>Just below the other lines that begin with <strong>apply plugin</strong> add a line to enable SafeArgs:</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="pln"><span class="pln">apply plugin</span></span><span class="pun"><span class="pun">:</span></span><span class="pln"><span class="pln"> </span></span><span class="str"><span class="str">'androidx.navigation.safeargs'</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>Android Studio should display a message about the Gradle files being changed. Click <strong>Sync Now</strong> on the right hand side. <img alt="50cedf1769381459.png" style="width: 624.00px" src="/static/codelabs/build-your-first-android-app/img/50cedf1769381459.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/50cedf1769381459_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<p>After a few moments, Android Studio should display a message in the Sync tab that it was successful: <img alt="a1c51cb92c04e07e.png" style="width: 375.00px" src="/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/a1c51cb92c04e07e_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></p>
<ol type="1" start="6">
<li>Choose <strong>Build &gt; Make Project</strong>. This should rebuild everything so that Android Studio can find <code translate="no" dir="ltr">FirstFragmentDirections</code>.</li>
</ol>
<aside class="warning"><p><strong>Troubleshooting:</strong> If the sync was not successful, confirm that you added the correct lines to the correct Gradle file. If there are still problems, check the developer's guide  <a href="https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args" target="_blank">about Safe Args</a> for an updated <code translate="no" dir="ltr">nav_version</code> or other changes.</p>
</aside>
<h2 is-upgraded="" id="step-6:-create-the-argument-for-the-navigation-action" data-text="Step 6: Create the argument for the navigation action" tabindex="-1"><strong>Step 6: Create the argument for the navigation action</strong></h2>
<ol type="1">
<li>In the navigation graph, click on <code translate="no" dir="ltr">FirstFragment</code>, and look at the <strong>Attributes</strong> panel to the right. (If the panel isn't showing, click on the vertical <strong>Attributes</strong> label to the right.)</li>
<li>In the <strong>Actions</strong> section, it shows what action will happen for navigation, namely going to <code translate="no" dir="ltr">SecondFragment</code>.</li>
<li>Click on <code translate="no" dir="ltr">SecondFragment</code>, and look at the <strong>Attributes</strong> panel.</li>
</ol>
<p>The <strong>Arguments</strong> section shows <code translate="no" dir="ltr">Nothing to show</code>.</p>
<ol type="1" start="4">
<li>Click on the <strong>+</strong> in the <strong>Arguments</strong> section.</li>
<li>In the <strong>Add Argument</strong> dialog, enter <code translate="no" dir="ltr">myArg</code> for the name and set the type to <strong>Integer</strong>, then click the <strong>Add</strong> button. <img alt="c334d61be24eb01d.png" style="width: 293.00px" src="/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/c334d61be24eb01d_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<h2 is-upgraded="" id="step-7:-send-the-count-to-the-second-fragment" data-text="Step 7: Send the count to the second fragment" tabindex="-1"><strong>Step 7: Send the count to the second fragment</strong></h2>
<p>The <strong>Next</strong>/<strong>Random</strong> button was set up by Android Studio to go from the first fragment to the second, but it doesn't send any information. In this step you'll change it to send a number for the current count. You will get the current count from the text view that displays it, and pass that to the second fragment.</p>
<ol type="1">
<li>Open <code translate="no" dir="ltr">FirstFragment.java</code> (<strong>app &gt; java &gt; com.example.myfirstapp &gt; FirstFragment</strong>)</li>
<li>Find the method <code translate="no" dir="ltr">onViewCreated()</code> and notice the code that sets up the click listener to go from the first fragment to the second.</li>
<li>Replace the code in that click listener with a line to find the count text view, <code translate="no" dir="ltr">textview_first</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">int</span></span><span class="pln"><span class="pln"> currentCount </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Integer</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">parseInt</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getText</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">());</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Create an action with <code translate="no" dir="ltr">currentCount</code> as the argument to <code translate="no" dir="ltr">actionFirstFragmentToSecondFragment()</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">FirstFragmentDirections</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">ActionFirstFragmentToSecondFragment</span></span><span class="pln"><span class="pln"> action </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">FirstFragmentDirections</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">actionFirstFragmentToSecondFragment</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">currentCount</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>Add a line to find the nav controller and navigate with the action you created.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">NavHostFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findNavController</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">FirstFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="kwd"><span class="kwd">this</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">navigate</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">action</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<p>Here is the whole method, including the code you added earlier:</p>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onViewCreated</span></span><span class="pun"><span class="pun">(</span></span><span class="lit"><span class="lit">@NonNull</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Bundle</span></span><span class="pln"><span class="pln"> savedInstanceState</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">super</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">onViewCreated</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> savedInstanceState</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">random_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">int</span></span><span class="pln"><span class="pln"> currentCount </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Integer</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">parseInt</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">showCountTextView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getText</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">());</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">FirstFragmentDirections</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">ActionFirstFragmentToSecondFragment</span></span><span class="pln"><span class="pln"> action </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">FirstFragmentDirections</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">actionFirstFragmentToSecondFragment</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">currentCount</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">NavHostFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findNavController</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">FirstFragment</span></span><span class="pun"><span class="pun">.</span></span><span class="kwd"><span class="kwd">this</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">navigate</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">action</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">toast_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="typ"><span class="typ">Toast</span></span><span class="pln"><span class="pln"> myToast </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Toast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">makeText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">getActivity</span></span><span class="pun"><span class="pun">(),</span></span><span class="pln"><span class="pln"> </span></span><span class="str"><span class="str">"Hello toast!"</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">Toast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">LENGTH_SHORT</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;myToast</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">show</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br><br>&nbsp; &nbsp;view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">count_button</span></span><span class="pun"><span class="pun">).</span></span><span class="pln"><span class="pln">setOnClickListener</span></span><span class="pun"><span class="pun">(</span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">View</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">OnClickListener</span></span><span class="pun"><span class="pun">()</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="lit"><span class="lit">@Override</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="kwd"><span class="kwd">public</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">void</span></span><span class="pln"><span class="pln"> onClick</span></span><span class="pun"><span class="pun">(</span></span><span class="typ"><span class="typ">View</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;countMe</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">view</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp; &nbsp; &nbsp;</span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;</span></span><span class="pun"><span class="pun">});</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="6">
<li>Run your app. Click the <strong>Count</strong> button a few times. Now when you press the <strong>Random</strong> button, the second screen shows the correct string in the header, but still no count or random number, because you need to write some code to do that.</li>
</ol>
<h2 is-upgraded="" id="step-8:-update-secondfragment-to-compute-and-display-a-random-number" data-text="Step 8: Update SecondFragment to compute and display a random number" tabindex="-1"><strong>Step 8: Update SecondFragment to compute and display a random number</strong></h2>
<p>You have written the code to send the current count to the second fragment. The next step is to add code to <code translate="no" dir="ltr">SecondFragment.java</code> to retrieve and use the current count.</p>
<ol type="1">
<li>In <code translate="no" dir="ltr">SecondFragment.java</code>, add an import for navArgs to the list of imported libraries.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="kwd"><span class="kwd">import</span></span><span class="pln"><span class="pln"> androidx</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">navigation</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">fragment</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">navArgs</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="2">
<li>In the <code translate="no" dir="ltr">onViewCreated()</code> method below the line that starts with <code translate="no" dir="ltr">super</code>, add code to get the current count,  get the string and format it with the count, and then set it for textview_header.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">Integer</span></span><span class="pln"><span class="pln"> count </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="typ"><span class="typ">SecondFragmentArgs</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">fromBundle</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">getArguments</span></span><span class="pun"><span class="pun">()).</span></span><span class="pln"><span class="pln">getMyArg</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br></span></span><span class="typ"><span class="typ">String</span></span><span class="pln"><span class="pln"> countText </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> getString</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="kwd"><span class="kwd">string</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">random_heading</span></span><span class="pun"><span class="pun">,</span></span><span class="pln"><span class="pln"> count</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span><span class="typ"><span class="typ">TextView</span></span><span class="pln"><span class="pln"> headerView </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getRootView</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">textview_header</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>headerView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">setText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">countText</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="3">
<li>Get a random number between 0 and the count.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">Random</span></span><span class="pln"><span class="pln"> random </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="kwd"><span class="kwd">new</span></span><span class="pln"><span class="pln"> java</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">util</span></span><span class="pun"><span class="pun">.</span></span><span class="typ"><span class="typ">Random</span></span><span class="pun"><span class="pun">();</span></span><span class="pln"><span class="pln"><br></span></span><span class="typ"><span class="typ">Integer</span></span><span class="pln"><span class="pln"> randomNumber </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> </span></span><span class="lit"><span class="lit">0</span></span><span class="pun"><span class="pun">;</span></span><span class="pln"><span class="pln"><br></span></span><span class="kwd"><span class="kwd">if</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">count </span></span><span class="pun"><span class="pun">&gt;</span></span><span class="pln"><span class="pln"> </span></span><span class="lit"><span class="lit">0</span></span><span class="pun"><span class="pun">)</span></span><span class="pln"><span class="pln"> </span></span><span class="pun"><span class="pun">{</span></span><span class="pln"><span class="pln"><br>&nbsp; &nbsp;randomNumber </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> random</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">nextInt</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">count </span></span><span class="pun"><span class="pun">+</span></span><span class="pln"><span class="pln"> </span></span><span class="lit"><span class="lit">1</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br></span></span><span class="pun"><span class="pun">}</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="4">
<li>Add code to convert that number into a string and set it as the text for <code translate="no" dir="ltr">textview_random</code>.</li>
</ol>
<devsite-code data-copy-event-label=""><pre class="" translate="no" dir="ltr" is-upgraded=""><code translate="no" dir="ltr"><span class="typ"><span class="typ">TextView</span></span><span class="pln"><span class="pln"> randomView </span></span><span class="pun"><span class="pun">=</span></span><span class="pln"><span class="pln"> view</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">getRootView</span></span><span class="pun"><span class="pun">().</span></span><span class="pln"><span class="pln">findViewById</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">R</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">id</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">textview_random</span></span><span class="pun"><span class="pun">);</span></span><span class="pln"><span class="pln"><br>randomView</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">setText</span></span><span class="pun"><span class="pun">(</span></span><span class="pln"><span class="pln">randomNumber</span></span><span class="pun"><span class="pun">.</span></span><span class="pln"><span class="pln">toString</span></span><span class="pun"><span class="pun">());</span></span><span class="pln"><span class="pln"><br></span></span></code></pre></devsite-code>
<ol type="1" start="5">
<li>Run the app. Press the <strong>Count</strong> button a few times, then press the <strong>Random</strong> button. Does the app display a random number in the new activity? <img alt="6cba94311109e72f.png" style="width: 589.08px" src="/static/codelabs/build-your-first-android-app/img/6cba94311109e72f.png" srcset="https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_36.png 36w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_48.png 48w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_72.png 72w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_96.png 96w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_480.png 480w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_720.png 720w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_856.png 856w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_960.png 960w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_1440.png 1440w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_1920.png 1920w,https://developer.android.com/static/codelabs/build-your-first-android-app/img/6cba94311109e72f_2880.png 2880w" sizes="(max-width: 840px) 100vw, 856px"></li>
</ol>
<p>Congratulations, you have built your first Android app!</p>


        </div></div></google-codelab-step><google-codelab-step label="Learn more" duration="0" step="9" tabindex="-1" style="transform: translate3d(110%, 0px, 0px);"><div class="instructions"><div class="inner"><h2 is-upgraded="" class="step-title"><a href="#9">10. Learn more</a></h2>
          
          
          <p>The intention of this codelab was to get you started building Android apps. We hope you want to know a lot more though, like how do I save data? How do I run background tasks? How do I display a list of photos? How do I ...</p>
<p>We encourage you to keep learning. We have more Android courses built by Google to help you on your learning journey.</p>
<h2 is-upgraded="" id="written-tutorials" data-text="Written tutorials" tabindex="-1"><strong>Written tutorials</strong></h2>
<ul>
<li><a href="https://developer.android.com/courses/kotlin-android-fundamentals/overview" target="_blank">Android Developer Fundamentals</a> teaches programmers to build Android apps. This course is also available in some schools.</li>
<li><a href="https://developer.android.com/courses/kotlin-bootcamp/overview" target="_blank">Kotlin Bootcamp codelabs course</a> is an introduction to <strong>Kotlin</strong> for programmers. You need experience with an object oriented programming language (Java, C++, Python) to take this course..</li>
<li>Find more at  <a href="https://developer.android.com/training/index.html" target="_blank">developer.android.com</a>, the official Android developer documentation from Google.</li>
</ul>
<p>These interactive, video-based courses were created by Google experts in collaboration with Udacity. Take these courses at your own pace in your own time.</p>
<ul>
<li><a href="https://www.udacity.com/course/developing-android-apps-with-kotlin--ud9012" target="_blank">Developing Android Apps in Kotlin</a>: If you know how to program, learn how to build Android apps. This course uses <strong>Kotlin</strong>.</li>
<li><a href="https://www.udacity.com/course/kotlin-bootcamp-for-programmers--ud9011" target="_blank">Kotlin Bootcamp for Programmers</a>: This is an introduction to Kotlin for programmers. You need some experience with an object oriented programming language (Java, C++, Python) to take this course.</li>
</ul>


        </div></div></google-codelab-step></div><div id="controls"><div id="fabs"><a href="#" id="previous-step" data-title="Previous step">Back</a><div class="spacer"><devsite-language-selector aria-label="Select your language preference.">
  <ul role="presentation">
    
    
    <li role="presentation">
      <a role="menuitem" lang="en" aria-current="true" href="https://developer.android.com/codelabs/build-your-first-android-app#5">English</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="es-419" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=es-419#5">Español – América Latina</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="id" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=id#5">Indonesia</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="pt-br" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=pt-br#5">Português – Brasil</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="zh-cn" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=zh-cn#5">中文 – 简体</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ja" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ja#5">日本語</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ko" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ko#5">한국어</a>
    </li>
    
  </ul>
</devsite-language-selector></div><a href="#" id="next-step" data-title="Next step">Next</a><a href="/" id="done" class="no-return-url" data-title="Codelab complete" hidden="">Done</a></div></div></div><div class="metadata"><a target="_blank" href="https://github.com/google-developer-training/first-android-app/issues/new?assignees=&amp;labels=&amp;template=first-android-app—java.md&amp;title=First+Android+App+codelab%3A+"><i class="material-icons">bug_report</i> Report a mistake</a></div></google-codelab>
  
  

  
</div>

  

  
    
    
    
  

  
  
</article>


<devsite-content-footer class="nocontent">
  <p>Except as otherwise noted, the content of this page is licensed under the <a href="https://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 License</a>, and code samples are licensed under the <a href="https://www.apache.org/licenses/LICENSE-2.0">Apache 2.0 License</a>. For details, see the <a href="https://developers.google.com/site-policies">Google Developers Site Policies</a>. Java is a registered trademark of Oracle and/or its affiliates.</p>
  
</devsite-content-footer>


<devsite-notification>
</devsite-notification>


  
<div class="devsite-content-data">
  <template class="devsite-thumb-rating-down-categories">
  [{
      "type": "thumb-down",
      "id": "missingTheInformationINeed",
      "label":"Missing the information I need"
    },{
      "type": "thumb-down",
      "id": "tooComplicatedTooManySteps",
      "label":"Too complicated / too many steps"
    },{
      "type": "thumb-down",
      "id": "outOfDate",
      "label":"Out of date"
    },{
      "type": "thumb-down",
      "id": "samplesCodeIssue",
      "label":"Samples / code issue"
    },{
      "type": "thumb-down",
      "id": "otherDown",
      "label":"Other"
    }]
  </template>
  <template class="devsite-thumb-rating-up-categories">
  [{
      "type": "thumb-up",
      "id": "easyToUnderstand",
      "label":"Easy to understand"
    },{
      "type": "thumb-up",
      "id": "solvedMyProblem",
      "label":"Solved my problem"
    },{
      "type": "thumb-up",
      "id": "otherUp",
      "label":"Other"
    }]
  </template>
  
</div>
            
          </devsite-content>
        </main>
        <devsite-footer-promos class="devsite-footer">
          
            

<nav class="devsite-footer-promos nocontent" aria-label="Promotions">
  <ul class="devsite-footer-promos-list">
    
    <li class="devsite-footer-promo">
      <a href="//x.com/AndroidDev" class="devsite-footer-promo-title gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer X Promo">
        
        
          
            <img class="devsite-footer-promo-icon" src="/_static/android/images/logo-x.svg" loading="lazy" alt="X">
          
        
        X
      </a>
      <div class="devsite-footer-promo-description">Follow @AndroidDev on X</div>
    </li>
    
    <li class="devsite-footer-promo">
      <a href="//www.youtube.com/user/androiddevelopers" class="devsite-footer-promo-title gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer YouTube Promo">
        
        
          
            <img class="devsite-footer-promo-icon" src="//www.gstatic.com/images/icons/material/product/2x/youtube_48dp.png" loading="lazy" alt="YouTube">
          
        
        YouTube
      </a>
      <div class="devsite-footer-promo-description">Check out Android Developers on YouTube</div>
    </li>
    
    <li class="devsite-footer-promo">
      <a href="//www.linkedin.com/showcase/androiddev" class="devsite-footer-promo-title gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer LinkedIn Promo">
        
        
          
            <img class="devsite-footer-promo-icon" src="/_static/android/images/logo-linkedin.svg" loading="lazy" alt="LinkedIn">
          
        
        LinkedIn
      </a>
      <div class="devsite-footer-promo-description">Connect with the Android Developers community on LinkedIn</div>
    </li>
    
  </ul>
</nav>

          
        </devsite-footer-promos>
        <devsite-footer-linkboxes class="devsite-footer">
          
            
<nav class="devsite-footer-linkboxes nocontent" aria-label="Footer links">
  
  <ul class="devsite-footer-linkboxes-list">
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">More Android</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//www.android.com" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Android
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//www.android.com/enterprise/" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Android for Enterprise
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//www.android.com/security-center/" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            Security
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//source.android.com" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
          
            Source
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/news" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 5)">
            
          
            News
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//android-developers.googleblog.com/" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 6)">
            
          
            Blog
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/podcasts" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 7)">
            
              
              
            
          
            Podcasts
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">Discover</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/games" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Gaming
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/ml" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Machine Learning
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/privacy" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            Privacy
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/training/connectivity/5g" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
              
              
            
          
            5G
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">Android Devices</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/large-screens" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Large screens
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/wear" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Wear OS
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/chrome-os" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            ChromeOS devices
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/cars" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
          
            Android for cars
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/tv" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 5)">
            
              
              
            
          
            Android TV
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">Releases</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/14" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Android 14
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/13" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Android 13
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/12" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            Android 12
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/11" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
          
            Android 11
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/10" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 5)">
            
          
            Android 10
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/pie" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 6)">
            
          
            Pie
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/oreo" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 7)">
            
          
            Oreo
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/about/versions/nougat" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 8)">
            
              
              
            
          
            Nougat
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">Documentation and Downloads</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/studio/intro" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Android Studio guide
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/guide" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Developers guides
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/reference" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            API reference
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/studio" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
          
            Download Studio
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="/ndk" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 5)">
            
              
              
            
          
            Android NDK
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
    <li class="devsite-footer-linkbox ">
    <h3 class="devsite-footer-linkbox-heading no-link">Support</h3>
      <ul class="devsite-footer-linkbox-list">
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//issuetracker.google.com/issues/new?component=190923&amp;template=841312" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 1)">
            
          
            Report platform bug
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//issuetracker.google.com/issues/new?component=192697" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 2)">
            
          
            Report documentation bug
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="//support.google.com/googleplay/android-developer" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 3)">
            
          
            Google Play support
          
          </a>
          
          
        </li>
        
        <li class="devsite-footer-linkbox-item">
          
          <a href="https://g.co/userresearch/androiddeveloperfooter" class="devsite-footer-linkbox-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Link (index 4)">
            
              
              
            
          
            Join research studies
          
          </a>
          
          
        </li>
        
      </ul>
    </li>
    
  </ul>
  
</nav>
          
        </devsite-footer-linkboxes>
        <devsite-footer-utility class="devsite-footer">
          
            

<div class="devsite-footer-utility nocontent">
  
  
  <nav class="devsite-footer-sites" aria-label="Other Google Developers websites">
    <a href="https://developers.google.com/" class="devsite-footer-sites-logo-link gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Google Developers Link">
      <picture>
        <source srcset="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/lockup-google-for-developers-dark-theme.svg" media="(prefers-color-scheme: none)" class="devsite-dark-theme" loading="lazy" alt="Google Developers">
        <img class="devsite-footer-sites-logo" src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/lockup-google-for-developers.svg" loading="lazy" alt="Google Developers">
      </picture>
    </a>
    <ul class="devsite-footer-sites-list">
      
      <li class="devsite-footer-sites-item">
        <a href="//developer.android.com" class="devsite-footer-sites-link
                  gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Android Link">
          Android
        </a>
      </li>
      
      <li class="devsite-footer-sites-item">
        <a href="//developer.chrome.com/home" class="devsite-footer-sites-link
                  gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Chrome Link">
          Chrome
        </a>
      </li>
      
      <li class="devsite-footer-sites-item">
        <a href="//firebase.google.com" class="devsite-footer-sites-link
                  gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Firebase Link">
          Firebase
        </a>
      </li>
      
      <li class="devsite-footer-sites-item">
        <a href="//cloud.google.com" class="devsite-footer-sites-link
                  gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer Google Cloud Platform Link">
          Google Cloud Platform
        </a>
      </li>
      
      <li class="devsite-footer-sites-item">
        <a href="//developers.google.com/products/" class="devsite-footer-sites-link
                  gc-analytics-event" data-category="Site-Wide Custom Events" data-label="Footer All products Link">
          All products
        </a>
      </li>
      
    </ul>
  </nav>
  

  
  <nav class="devsite-footer-utility-links" aria-label="Utility links">
    
    <ul class="devsite-footer-utility-list">
      
      <li class="devsite-footer-utility-item
                 ">
        
        
        <a class="devsite-footer-utility-link gc-analytics-event" href="//policies.google.com/privacy" data-category="Site-Wide Custom Events" data-label="Footer Privacy link">
          Privacy
        </a>
        
      </li>
      
      <li class="devsite-footer-utility-item
                 ">
        
        
        <a class="devsite-footer-utility-link gc-analytics-event" href="/license" data-category="Site-Wide Custom Events" data-label="Footer License link">
          License
        </a>
        
      </li>
      
      <li class="devsite-footer-utility-item
                 ">
        
        
        <a class="devsite-footer-utility-link gc-analytics-event" href="/distribute/marketing-tools/brand-guidelines" data-category="Site-Wide Custom Events" data-label="Footer Brand guidelines link">
          Brand guidelines
        </a>
        
      </li>
      
      <li class="devsite-footer-utility-item
                 glue-cookie-notification-bar-control">
        
        
        <a class="devsite-footer-utility-link gc-analytics-event" href="#" data-category="Site-Wide Custom Events" data-label="Footer Manage cookies link" aria-hidden="true">
          Manage cookies
        </a>
        
      </li>
      
      <li class="devsite-footer-utility-item
                 devsite-footer-utility-button">
        
        <span class="devsite-footer-utility-description">Get news and tips by email</span>
        
        
        <a class="devsite-footer-utility-link gc-analytics-event" href="/updates" data-category="Site-Wide Custom Events" data-label="Footer Subscribe link">
          Subscribe
        </a>
        
      </li>
      
    </ul>
    
    
<devsite-language-selector aria-label="Select your language preference.">
  <ul role="presentation">
    
    
    <li role="presentation">
      <a role="menuitem" lang="en" aria-current="true" href="https://developer.android.com/codelabs/build-your-first-android-app#5">English</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="es-419" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=es-419#5">Español – América Latina</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="id" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=id#5">Indonesia</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="pt-br" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=pt-br#5">Português – Brasil</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="zh-cn" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=zh-cn#5">中文 – 简体</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ja" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ja#5">日本語</a>
    </li>
    
    <li role="presentation">
      <a role="menuitem" lang="ko" href="https://developer.android.com/codelabs/build-your-first-android-app?hl=ko#5">한국어</a>
    </li>
    
  </ul>
</devsite-language-selector>

  </nav>
</div>
          
        </devsite-footer-utility>
        <devsite-panel style="height: auto;"></devsite-panel>
        
      </section></section>
    <devsite-sitemask></devsite-sitemask>
    <devsite-snackbar style="bottom: 0px;">
</devsite-snackbar>
    <devsite-tooltip></devsite-tooltip>
    <devsite-heading-link></devsite-heading-link>
    <devsite-analytics analytics-iframe="" enable-cb="">
      
        <script async="" src="https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/app_loader.js"></script><script type="application/json" analytics="">[{&#34;dimensions&#34;: {&#34;dimension5&#34;: &#34;en&#34;, &#34;dimension11&#34;: false, &#34;dimension3&#34;: false, &#34;dimension1&#34;: &#34;Signed In&#34;, &#34;dimension6&#34;: &#34;en&#34;}, &#34;gaid&#34;: &#34;UA-5831155-1&#34;, &#34;metrics&#34;: {&#34;ratings_count&#34;: &#34;metric2&#34;, &#34;ratings_value&#34;: &#34;metric1&#34;}, &#34;purpose&#34;: 0}]</script>
<script type="application/json" tag-management="">{&#34;ga4&#34;: [], &#34;ga4p&#34;: [], &#34;gtm&#34;: [], &#34;parameters&#34;: {&#34;internalUser&#34;: &#34;False&#34;, &#34;language&#34;: {&#34;machineTranslated&#34;: &#34;False&#34;, &#34;requested&#34;: &#34;en&#34;, &#34;served&#34;: &#34;en&#34;}, &#34;pageType&#34;: &#34;codelab&#34;, &#34;projectName&#34;: null, &#34;signedIn&#34;: &#34;True&#34;, &#34;tenant&#34;: &#34;android&#34;, &#34;recommendations&#34;: {&#34;sourcePage&#34;: &#34;&#34;, &#34;sourceType&#34;: 0, &#34;sourceRank&#34;: 0, &#34;sourceIdenticalDescriptions&#34;: 0, &#34;sourceTitleWords&#34;: 0, &#34;sourceDescriptionWords&#34;: 0, &#34;experiment&#34;: &#34;&#34;}, &#34;experiment&#34;: {&#34;ids&#34;: &#34;&#34;}}}</script>
      
    <iframe sandbox="allow-same-origin allow-scripts allow-forms allow-popups allow-popups-to-escape-sandbox allow-storage-access-by-user-activation" src="https://developers.google.com/_d/analytics-iframe"></iframe></devsite-analytics>
    
      <devsite-badger></devsite-badger>
    
    
<android-fully-clickable target="
        .android-case-study .devsite-landing-row-item,
        .android-grouped-resources .devsite-landing-row-item,
        .android-grouped-resources-primary .devsite-landing-row-item,
        .android-grouped-resources-secondary .devsite-landing-row-item,
        .android-illustrated-resources-index .devsite-landing-row-item,
        .android-illustrated-resources-primary .devsite-landing-row-item,
        .android-illustrated-resources-secondary .devsite-landing-row-item,
        .android-illustrated-resources-secondary-small .devsite-landing-row-item,
        .android-illustrated-resources-tertiary .devsite-landing-row-item,
        .android-illustrated-resources-tertiary-small .devsite-landing-row-item,
        .android-promo .devsite-landing-row-item,
        .android-quick-link,
        .android-samples .devsite-card-wrapper,
        .fully-clickable" watch=".android-samples, devsite-content"></android-fully-clickable>
    <script nonce="">
  
  (function(d,e,v,s,i,t,E){d['GoogleDevelopersObject']=i;
    t=e.createElement(v);t.async=1;t.src=s;E=e.getElementsByTagName(v)[0];
    E.parentNode.insertBefore(t,E);})(window, document, 'script',
    'https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/js/app_loader.js', '[3,"en",null,"/js/devsite_app_module.js","https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772","https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android","https://android-dot-devsite-v2-prod.appspot.com",1,null,["/_pwa/android/manifest.json","https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/images/video-placeholder.svg","https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/favicon.png","https://www.gstatic.com/devrel-devsite/prod/v98430d67869e4c9fcc4f6174e040606a1a4469c1d96401a32bd7505543a55772/android/images/lockup.svg","https://fonts.googleapis.com/css?family=Google+Sans:400,500,600,700|Google+Sans+Text:400,400italic,500,500italic,600,600italic,700,700italic|Roboto+Mono:400,500,700&display=swap"],1,null,[1,6,8,12,14,17,21,25,50,52,63,70,75,76,80,87,91,92,93,97,98,100,101,102,103,104,105,107,108,109,110,112,113,117,118,120,122,124,125,126,127,129,130,131,132,133,134,135,136,138,140,141,147,148,149,151,152,156,157,158,159,161,163,164,168,169,170,179,180,182,183,186,190,191,193,196],"AIzaSyAP-jjEJBzmIyKR4F-3XITp8yM9T1gEEI8","AIzaSyB6xiKGDR5O3Ak2okS4rLkauxGUG7XP0hg","developer.android.com","AIzaSyAQk0fBONSGUqCNznf6Krs82Ap1-NV6J4o","AIzaSyCCxcqdrZ_7QMeLCRY20bh_SXdAYqy70KY",null,null,null,["MiscFeatureFlags__enable_explain_this_code","MiscFeatureFlags__emergency_css","Cloud__enable_cloud_shell","Cloud__enable_llm_concierge_chat","Profiles__enable_developer_profiles_callout","Significatio__enable_by_tenant","Profiles__enable_profile_notifications_ui","Profiles__enable_page_saving","MiscFeatureFlags__enable_keyword_inheritance","Search__enable_dynamic_content_confidential_banner","MiscFeatureFlags__enable_firebase_utm","Profiles__require_profile_eligibility_for_signin","Experiments__reqs_query_experiments","OpenInReplit__enable_replit","Profiles__enable_profile_communities","Profiles__enable_public_developer_profiles","Profiles__enable_release_notes_notifications","BookNav__enable_tenant_cache_key","Concierge__enable_pushui","TpcFeatures__enable_mirror_tenant_redirects","Profiles__enable_awarding_url","Search__enable_suggestions_from_borg","Search__enable_faceted_search","MiscFeatureFlags__developers_footer_image","Profiles__enable_profile_collections","Analytics__enable_cookie_bar","Cloud__enable_cloudx_ping","Cloud__enable_cloud_facet_chat","Cloud__enable_cloud_dlp_service","MiscFeatureFlags__enable_project_variables","MiscFeatureFlags__developers_footer_dark_image","Cloud__enable_cloud_shell_fte_user_flow","Cloud__enable_free_trial_server_call","Search__enable_page_map","Cloud__enable_cloudx_experiment_ids","MiscFeatureFlags__enable_variable_operator"],null,null,"AIzaSyBLEMok-5suZ67qRPzx0qUtbnLmyT_kCVE","https://developerscontentserving-pa.googleapis.com","AIzaSyCM4QpTRSqP5qI4Dvjt4OAScIN8sOUlO-k","https://developerscontentsearch-pa.googleapis.com",2,4]')
  
</script>
    <devsite-a11y-announce aria-live="assertive" aria-atomic="true"></devsite-a11y-announce>
  
</body></html>