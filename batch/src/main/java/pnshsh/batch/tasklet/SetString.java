package pnshsh.batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SetString implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		arg1.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("key", "201303");
		
		return RepeatStatus.FINISHED;
	}

}
