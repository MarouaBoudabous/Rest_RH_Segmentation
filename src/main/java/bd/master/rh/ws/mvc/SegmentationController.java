package bd.master.rh.ws.mvc;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bd.master.rh.documentSegmentation.MainSegmenter;
import bd.master.rh.documentSegmentation.structure.Section;

@RestController
@RequestMapping(value = "/api")
public class SegmentationController {
	@RequestMapping(value = "/segmentation")
	public List<Section> processSegmentation(@RequestParam(value = "path", defaultValue = "") String path) {
		MainSegmenter segmenter = new MainSegmenter();
		if (path.isEmpty()) {
			// throw error
		} else {
			try {
				return segmenter.processDocument(path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// return new ArrayList<Section>();
		return null;

	}
}
