

Pod::Spec.new do |s|



  s.name         = "amap"
  s.version      = "1.0.0"
  s.summary      = "eeui plugin."
  s.description  = <<-DESC
                    eeui plugin.
                   DESC

  s.homepage     = "https://eeui.app"
  s.license      = "MIT"
  s.author             = { "veryitman" => "aipaw@live.cn" }
  s.source =  { :path => '.' }
  s.source_files  = "amap", "**/**/*.{h,m,mm,c}"
  s.exclude_files = "Source/Exclude"
  s.resources = 'amap/resources/*.*'
  s.platform     = :ios, "8.0"
  s.requires_arc = true

  s.dependency 'WeexSDK'
  s.dependency 'eeui'
  s.dependency 'WeexPluginLoader', '~> 0.0.1.9.1'
  
  s.dependency 'AMap3DMap','6.6.0'
  s.dependency 'AMapFoundation'

end
